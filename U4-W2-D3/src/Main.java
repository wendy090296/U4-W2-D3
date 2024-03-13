import exercise1.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {


            List<Product> productsList= new ArrayList<>(); // credo lista prodotti

            Product mangiaPregaAma = new Product(965081126, "Mangia Prega Ama", "Books", 99.5);
            Product lombraDelVento = new Product(1234907632, "L'ombra del vento", "Books", 102.4);
            Product comeUnanotteABali = new Product(569441123, "Come una notte a Bali'", "Books", 13.80);
            Product unIndovinoMiDisse = new Product(393377900, "Un indovino mi disse", "Books", 25.70);
            Product unAltroGiroDiGiostra= new Product(324679045, "Un altro giro di giostra","Books", 165.9);

            Product pacifier = new Product(802472114, "Pacifier", "Baby", 17.80);
            Product pushchair = new Product(411168842, "Pushchair", "Baby", 150.25);
            Product bodySpray = new Product(300756789, "Spray", "Baby", 29.90);

            Product backpac = new Product(741256, "Backpac", "Boys", 79.90);
            Product shoes = new Product(616584, "Shoes", "Boys", 200.6);
            Product cap = new Product(259114, "Cap", "Boys", 39.90);




            productsList.add(mangiaPregaAma);
            productsList.add(lombraDelVento);
            productsList.add(comeUnanotteABali);
            productsList.add(unIndovinoMiDisse);
            productsList.add(pacifier);
            productsList.add(pushchair);
            productsList.add(bodySpray);
            productsList.add(backpac);
            productsList.add(shoes);
            productsList.add(cap);


            System.out.println("Your products list has  " + productsList.size() + " products.");

            for (Product product : productsList) {
                System.out.println(product);
            }

        System.out.println("-------------LISTA DI BOOKS CON PREZZO MAGGIORE DI 100------------");

            productsList.stream().filter(product -> product.getCategory().equals("Books")&& product.getPrice()>100).forEach(System.out::println);



        System.out.println("-----------LISTA PRODOTTI CATEGORIA BABY-------------");


        productsList.stream().filter(product -> product.getCategory().equals("Baby")).forEach(product -> System.out.println(product));

        System.out.println("--------LISTA PRODOTTI CATEGORIA BOYS CON SCONTO DEL  10%---------");

        productsList.stream().filter(product -> product.getCategory().equals("Boys")).forEach(product -> {
            double discountedPrice = product.getPrice() * 0.9; // Applico lo sconto del 10%
            product.setPrice(discountedPrice); // Imposto il nuovo prezzo scontato
            System.out.println(product);
        });

        System.out.println("LISTA PRODOTTI ORDINATI TRA 01/02 E 01/04 2021");
        productsList.stream().filter(order -> order.getCustomer().getTier() == 2 &&
                        order.getOrderDate().isAfter(LocalDate.parse("2021-02-01")) &&
                        order.getOrderDate().isBefore(LocalDate.parse("2021-04-01")))
                .flatMap(order -> order.getProducts().stream())
                .collect(Collectors.toList());

        System.out.println("Prodotti ordinati da clienti di livello 2 tra l'01-Feb-2021 e l'01-Apr-2021:");
        tier2Products.forEach(System.out::println);




    }



    }

