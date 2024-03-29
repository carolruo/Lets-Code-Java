package modulo04;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class CryptoSimulator {
    public static void main(String[] args) {
        LocalDate diaPrimeiro = LocalDate.of(2022, 6, 1);
        LocalDate diaSegundo = LocalDate.of(2022, 6, 2);
        LocalDate diaTerceiro = LocalDate.of(2022, 6, 3);

        final var btc = new Currency("btc", BigDecimal.valueOf(20_000));
        final var eth = new Currency("eth", BigDecimal.valueOf(10_000));
        final var luna = new Currency("luna", BigDecimal.valueOf(1_000));

        final var orders = Arrays.asList(
                new Order(4L, btc, diaPrimeiro),
                new Order(1L, btc, diaSegundo),
                new Order(2L, btc, diaTerceiro),
                new Order(1L, btc, diaTerceiro),
                new Order(2L, eth, diaPrimeiro),
                new Order(8L, eth, diaTerceiro),
                new Order(18L, luna, diaPrimeiro),
                new Order(12L, luna, diaPrimeiro),
                new Order(8L, luna, diaSegundo),
                new Order(1L, luna, diaPrimeiro),
                new Order(10L, luna, diaTerceiro)
        );

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"));

        // Total: R$ 269.000,00
        BigDecimal total = getTotal(orders);
        System.out.println("Total: " + nf.format(total));

        // obter valores detalhados: Detalhes: {btc=60000, eth=20000, luna=5000}
        Map<String, BigDecimal> details = getTotalByCrypto(orders);
        System.out.println("Details: " + details);

        // obter valores detalhados diretamente pro usuário: Details 2: {btc=R$ 80.000,00, eth=R$ 20.000,00, luna=R$ 5.000,00}
        Map<String, String> details2 = getFormattedTotalByCrypto(orders);
        System.out.println("Details 2: " + details2);

        //Details 3: {btc={2022-06-03=60000, 2022-06-02=20000, 2022-06-01=60000}, eth={2022-06-03=80000, 2022-06-01=20000}, luna={2022-06-03=10000, 2022-06-02=8000, 2022-06-01=31000}}
        Map<String, Map<LocalDate, BigDecimal>> details3 = getTotalByCryptoDetailedByDate(orders);
        System.out.println("Details 3: " + details3);

        // Using last impl
        BigDecimal btcCompradosDia = details3.get("btc").get(LocalDate.of(2022, 6, 3));
        System.out.println("Btc comprados dia 2: " + btcCompradosDia);

    }

    public static BigDecimal getTotal(List<Order> orders) {
        // Retorno Esperado: 26900000
        return orders.stream()
                .map(order -> {
                    BigDecimal amountAsBD = BigDecimal.valueOf(order.amount());
                    return order.currency().price().multiply(amountAsBD);
                })
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public static Map<String, BigDecimal> getTotalByCrypto(List<Order> orders) {
        // Retorno Esperado: {btc=80000, eth=20000, luna=5000}
        return orders
                .stream()
                .collect(Collectors.toMap(
                        order -> order.currency().name(),
                        order -> order.currency().price().multiply(BigDecimal.valueOf(order.amount())),
                        (a, b) -> a.add(b) //BigDecimal::add
                ));

//        return orders.stream().collect(Collectors.groupingBy(
//                        order -> order.currency().name(),
//                        Collectors.mapping(
//                                order -> order.currency().price().multiply(BigDecimal.valueOf(order.amount())),
//                                Collectors.reducing(BigDecimal.ZERO, BigDecimal::add)
//                        )
//                ));
    }

    public static Map<String, String> getFormattedTotalByCrypto(List<Order> orders) {
        // Retorno esperado: {btc=R$ 80.000,00, eth=R$ 20.000,00, luna=R$ 5.000,00}
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"));

        return getTotalByCrypto(orders)
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                    entryset -> entryset.getKey(),
                    entryset -> nf.format(entryset.getValue()
                    )
        ));
    }

    public static Map<String, Map<LocalDate, BigDecimal>> getTotalByCryptoDetailedByDate(List<Order> orders) {
        // Retorno esperado: {btc={2022-06-03=60000, 2022-06-02=20000, 2022-06-01=60000}, eth={2022-06-03=80000, 2022-06-01=20000}, luna={2022-06-03=10000, 2022-06-02=8000, 2022-06-01=31000}}
        return orders
                .stream()
                .collect(Collectors.groupingBy(
                        order -> order.currency().name(),
                        Collectors.toMap(
                                order -> order.date(),
                                order -> order.currency().price().multiply(BigDecimal.valueOf(order.amount())),
                                (a, b) -> a.add(b) // isso é pora quando vier chave duplicada
                        )
                ));
    }
}

record Order(Long amount,
             Currency currency,
             LocalDate date) {}

record Currency(String name,
                BigDecimal price) {}
