import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        // Задача 1
                                byte a = 1;
                            short b = 2;
                        int c = 3;
                    long d = 4L;
                float e = 1.1f;
            double f = 2.2;
            System.out.println("Значение переменной a с типом byte равно " + a);
                System.out.println("Значение переменной b с типом short равно " + b);
                    System.out.println("Значение переменной c с типом int равно " + c);
                        System.out.println("Значение переменной d с типом long равно " + d);
                            System.out.println("Значение переменной e с типом float равно " + e);
                                System.out.println("Значение переменной f с типом double равно " + f);
        float one = 27.12f;
        long two = 987678965549L;
        double free = 2.786;
        short four = 569;
        int five = -159;
        short six = 27897;
        byte seven = 67;
        System.out.println(one);
        System.out.println(two);
        System.out.println(free);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
        // Задача 3
        byte oneClass = 23;
        byte twoClass = 27;
        byte freeClass = 30;
        int lists = 480;
        int quantity = oneClass + twoClass + freeClass;
        System.out.println("Всего учеников " + quantity);
        int result = lists / quantity;
        System.out.println("На каждого ученика рассчитано " + result + " листов бумаги");

        // Задача 4
        byte oneTime = 2;
        byte onePerformance = 16;
        byte twoTime = 20;
        int differenceTime = twoTime / oneTime;
            System.out.println("Разница во времени " + differenceTime);
            int twoPerfomance = differenceTime * onePerformance;
                System.out.println("Производительность за 20 минут " + twoPerfomance + " бутылок");
            byte freeTime = 24;
            int oneDifferenceTime = freeTime / oneTime;
                System.out.println("Разница во времени " + oneDifferenceTime);
            int freePerfomance = oneDifferenceTime * onePerformance;
                System.out.println("Производительность за сутки " + freePerfomance + " бутылок");
                byte fourTime = 24*3;
        int twoDifferenceTime = fourTime / oneTime;
        System.out.println("Разница во времени " + twoDifferenceTime);
        int fourPerfomance = twoDifferenceTime * onePerformance;
        System.out.println("Производительность за 3 дня " + fourPerfomance + " бутылок");

        short fiveTime = 30*24;
        System.out.println ("Количестов часов в одном месяце (30 дней) " + fiveTime);
        int freeDifferenceTime = fiveTime / oneTime;
        System.out.println("Разница во времени " + freeDifferenceTime);
        int fivePerfomance = freeDifferenceTime * onePerformance;
        System.out.println("Производительность за месяц (30 дней) " + fivePerfomance + " бутылок");
        // Задача 5
        byte totalCans = 120;
        byte consumptionOneClassWhite = 2;
        byte consumptionOneClassBrown = 4;
        int totalConsumptionOneClass = consumptionOneClassBrown +consumptionOneClassWhite;
        int numberOfClasses = totalCans / totalConsumptionOneClass;
        System.out.println("Всего классов в школе " + numberOfClasses);
        int weightWhiteCans = numberOfClasses * consumptionOneClassWhite;
        int weightBrownCans = numberOfClasses * consumptionOneClassBrown;
        System.out.println ("В школе где " + numberOfClasses + " классов нужно" + weightWhiteCans + " банок белой краски и " + weightBrownCans + " банок коричневой краски");

        // Задача 6
        byte bananas = 5;
        byte weightOneBananas = 80;
        short milk = 200;
        byte weightOneMilk = 105;
        byte iceCream = 2;
        byte weightOneIceCream = 100;
        byte eggs = 4;
        byte weightOneEggs = 70;

        int breakfastWeight = (bananas * weightOneBananas) + (weightOneMilk * milk/100) + (iceCream * weightOneIceCream) + (weightOneEggs * eggs);
        System.out.println("Количество грамм " + breakfastWeight + " в завтраке");

        float breakfastWeightKillogramm = breakfastWeight / 100;
        System.out.println("Количество килограмм " + breakfastWeightKillogramm + " в завтраке");

        //Задача 7
        short dropWeight = 7000;
        short oneResetPerDay = 250;
        short twoResetPerDay = 500;
        int oneNumber_of_days = dropWeight / oneResetPerDay;
        int twoNumber_of_days = dropWeight/ twoResetPerDay;
        System.out.println("Если сбрасывать в день по 250 грамм, то потребуется " + oneNumber_of_days + " дней");
        System.out.println("Если сбрасывать в день по 500 грамм, то потребуется " + twoNumber_of_days + " дней");

        // Задача 8
        int current_Income_Masha = 67760;
        int current_Income_Denis = 83690;
        int current_Income_Kristina = 76230;
        int annual_Income_Masha = current_Income_Masha * 12;
        int annual_Income_Denis = current_Income_Denis * 12;
        int annual_Income_Kristina = current_Income_Kristina* 12;
        System.out.println("Годовой доход Маши до повышения " + annual_Income_Masha + " тысячи рублей");
        System.out.println("Годовой доход Дениса до повышения " + annual_Income_Denis + " тысячи рублей");
        System.out.println("Годовой доход Кристины до повышения " + annual_Income_Kristina + " тысячи рублей");
        int newCurrent_Income_Masha = (current_Income_Masha * 10/100) + current_Income_Masha ;
        System.out.println("Месячный доход Маши с учетом повышения на 10% составит " + newCurrent_Income_Masha + " тысяч рублей");
        int newCurrent_Income_Denis = (current_Income_Denis * 10/100) + current_Income_Denis;
        System.out.println("Месячный доход Дениса с учетом повышения на 10% составит " + newCurrent_Income_Denis + " тысяч рублей");
        int newCurrent_Income_Kristina = (current_Income_Kristina * 10/100) + current_Income_Kristina;
        System.out.println("Месячный доход Кристины с учетом повышения на 10% составит " + newCurrent_Income_Kristina + " тысяч рублей");
        int newAnnual_Income_Masha = newCurrent_Income_Masha * 12;
        int newAnnual_Income_Denis = newCurrent_Income_Denis * 12;
        int newAnnual_Income_Kristina =newCurrent_Income_Kristina * 12;
        System.out.println("Годовой доход Маши после повышения " + newAnnual_Income_Masha + " тысяч рублей");
        System.out.println("Годовой доход Дениса после повышения " + newAnnual_Income_Denis + " тысяч рублей");
        System.out.println ("Годовой доход Кристины после повышения " + newAnnual_Income_Kristina + " тысяч рублей");
        int differentAnnual_Income_Masha = newAnnual_Income_Masha - annual_Income_Masha;
        System.out.println("Разница между годовым доходом До и После повышения у Маши, составляет " + differentAnnual_Income_Masha + " тысяч рублей");
        int differntAnnual_Income_Denis = newAnnual_Income_Denis - annual_Income_Denis;
        System.out.println ("Разница между годовым доходом До и После повышения у Дениса, составляет " + differntAnnual_Income_Denis + " тысяч рублей");
        int differentAnnual_Income_Kristina = newAnnual_Income_Kristina - annual_Income_Kristina;
        System.out.println("Разница между годовым доходом До и После повышения у Кристины, составляет " + differentAnnual_Income_Kristina + " тысяч рублей");
























    }
}