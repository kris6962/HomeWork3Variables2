public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Task1");
        int intV = 2285;
        byte byteV = 16;
        short shortV = 303;
        long longV = 1_000_000_000_000_000_000L;
        float floatV = 5.8656565F;
        double doubleV = 6.87985455649845E00;

        System.out.println("Значение переменной intV с типом int равно " + intV);
        System.out.println("Значение переменной byteV с типом byte равно " + byteV);
        System.out.println("Значение переменной shortV с типом short равно " + shortV);
        System.out.println("Значение переменной longV с типом long равно " + longV);
        System.out.println("Значение переменной floatV с типом float равно " + floatV);
        System.out.println("Значение переменной doubleV с типом double равно " + doubleV);

        // task 2
        System.out.println("Task2");
        float v1 = 27.12F;
        long v2 = 987_678_965_549L;
        float v3 = 2.786F;
        int v4 = 569;
        short v5 = -159;
        short v6 = 27897;
        byte v7 = 67;

        // task 3
        System.out.println("Task3");
        int class1LP = 23;
        int class2AS = 27;
        int class3EA = 30;

        int countOfPaper = 480;
        System.out.println("На каждого ученика рассчитано "+ (countOfPaper/(class1LP+class2AS+class3EA)) +
                " листов бумаги.");

        // task 4
        System.out.println("Task4");
        int effic = 8;
        int effic1 = 20*effic;
        System.out.println("За 20 минут машина произвела " + effic1 +" штук бутылок");

        int effic2 = 24*60*effic;
        System.out.println("За сутки машина произвела " + effic2 +" штук бутылок");

        int effic3 = 3*effic2;
        System.out.println("За 3 дня машина произвела " + effic3 +" штук бутылок");

        int effic4 = 30*effic2;
        System.out.println("За 1 месяц машина произвела " + effic4 +" штук бутылок");

        // task 5
        System.out.println("Task5");
        int cansOfPaint = 120;
        int whiteCansPerCl = 2;
        int brownCansPerCl = 4;
        int classRooms = cansOfPaint/(whiteCansPerCl+brownCansPerCl);
        System.out.println("В школе, где "+ classRooms +" классов, нужно "+ (classRooms*whiteCansPerCl) +
                " банок белой краски и "+ (classRooms*brownCansPerCl) +" банок коричневой краски");

        // task 6
        System.out.println("Task6");
        var bananasGr = 80*5;
        var milkGr = 105*2;
        var iceCreamGr = 2*100;
        var eggsGr = 70*4;

        var weightBreakfast = (bananasGr+milkGr+iceCreamGr+eggsGr);
        System.out.println("Вес спортзавтрака в граммах: "+weightBreakfast+", а в килограммах: "+((weightBreakfast/1000F)));

        // task 7
        System.out.println("Task7");
        var throwOff = 7000;
        var resetGr250 = throwOff/250;
        var resetGr500 = throwOff/500;
        var averageNumberOfDays = (resetGr250+resetGr500)/2;

        System.out.println(resetGr250+" дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм, а "
                +resetGr500+" дней — если каждый день будет худеть на 500 грамм.");
        System.out.println("Спортсмену потребуется "+averageNumberOfDays+" день в среднем, чтобы добиться нужного результата похудения");

        // task 8
        System.out.println("Task8");
        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int christinaSalary = 76_230;

        int increasedMashaSalary = (int) (mashaSalary*1.1);
        int increasedDenisSalary = (int) (denisSalary*1.1);
        int increasedChristinaSalary = (int) (christinaSalary*1.1);

        int annualIncomeHasIncreasedMashaSalary = (increasedMashaSalary-mashaSalary)*12;
        int annualIncomeHasIncreasedDenisSalary = (increasedDenisSalary-denisSalary)*12;
        int annualIncomeHasIncreasedChristinaSalary = (increasedChristinaSalary-christinaSalary)*12;

        System.out.println("Маша теперь получает "+increasedMashaSalary+" рублей. Годовой доход вырос на "+annualIncomeHasIncreasedMashaSalary+" рублей");
        System.out.println("Денис теперь получает "+increasedDenisSalary+" рублей. Годовой доход вырос на "+annualIncomeHasIncreasedDenisSalary+" рублей");
        System.out.println("Кристина теперь получает "+increasedChristinaSalary+" рублей. Годовой доход вырос на "+annualIncomeHasIncreasedChristinaSalary+" рублей");

    }
}