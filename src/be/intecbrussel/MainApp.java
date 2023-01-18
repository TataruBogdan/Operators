package be.intecbrussel;

public class MainApp {

    public static void main(String[] args) {

        // arithmetic operators (+, - *, /)
        // + -> optellen
        int x = 10;
        int y = 5;
        int z = x + y;
        System.out.println(z);

        // - aftrekken
        z = x- y;
        System.out.println(z);
        System.out.println(x - y);

        // * -> maal
        z = x * y;
        System.out.println(z);

        // / -> delen
        z = x / y;
        System.out.println(z);

        // ++ -> plus 1
        int i = 10;
        System.out.println("i -> " + i);
        i++;
        System.out.println("i -> " + i);

        int  k = 10;
        System.out.println("k ->" + k);
        int l = ++k;
        System.out.println(l);

        // ++k => eerst optellen dan toekennen aan l;
        // k++ => eerst toekennen aan l dan optellen

        // -- -> min 1
        int j = 10;
        j--;
        System.out.println(j);

        // demo
        int o = 10;
        int p = ++o;
        System.out.println("p is: " + p);
        System.out.println("o is: " + o);

        // of

        int q = 10;
        int w = q++;
        System.out.println("w is: " + w);
        System.out.println("q is: " + q);

        // % modulo operator -> rest value
        x = 10;
        y = 3;
        z = x % y; // rest value is 1
        System.out.println("rest value is "+ z);

        // relational operators (==, !=, <, >, <=, >=) -> always true or false as result
        // == -> gelijk aan
        x = 20;
        y = 20;
        boolean result = x == y; // == return always boolean
        System.out.println("x == y : " +  result);

        // != => niet gelijk aan
        x = 10;
        y = 15;
        result = x != y; // != return always boolean
        System.out.println("x != y : " + result);

        // < => kleiner dan
        x = 10;
        y = 400;
        result = x < y; // < return always boolean
        System.out.println("x < y : " + result);

        // > => groter dan
        x = 90;
        y = 8;
        result = x > y;
        System.out.println("x > y : " + result);

        // (<=) => kleiner of gelijk aan
        x = 10;
        y = 9;
        result = x <= y;
        System.out.println("x <= y :" + result);

        // (>=) => groter of gelijk aan
        x = 54;
        y = 8;
        result = x >= y;
        System.out.println("x >= y :" + result);

        // logical operator (&&) And - (||) Or (!) Not
        // && => AND
        boolean g = true;
        boolean h = false;
        result =  g && h;
        //both left hand and right hand must be true -> return true
        System.out.println("g && h : " + result);

        // || => OR
        g = true;
        h = false;
        result = g || h;
        // if left of right hand is true -> result true
        System.out.println("g || h : " + result);

        // ! => NOT
        g = false;
        result = !g;
        System.out.println("!g : " + result);

        // reverse result ( 10 < 1)
        result = !(10 < 1);
        System.out.println("!(10 < 1) : " + result);

        //assignment operators =, -=, +=, *=, /=, %=
        // = => toekenningsteken
        int a = 10;

        // += => toevoegen en toekennen
        int n = 4;
        int m = 6;
        m += n; // korte notatie
        //m = m + n; // lange notatie
        System.out.println("m += n : " + m);

        // deze lijn is commentaar en wordt niet uitegevoerd

        // -= => aftrekken en toekennen
        n = 7;
        m = 100;
        m -= n; // korte notatie
        m = m - n; // lange notatie
        System.out.println("m -= n : " + m);

        // *= => vermenigvuldegen en toekennen
        n = 10;
        m = 2;
        m *= n; // korte notatie
        // m = m * n; // lange notatie
        System.out.println("m *= n : " + m);

        // /= => delen en toekennen
        n = 2;
        m = 100;
        m /= n;
        // m = m / n; // lange notatie
        System.out.println("m /= n : " + m);

        // %= restant en toekennen
        n = 10;
        m = 3;
        n %= m;
        // n = n % m;
        System.out.println("n %= m : " + n);

        // combinatie
        x = 10;
        y = 5;
        boolean res = (x > y) && (x < 20);
        System.out.println("(x > y) && (x < 20) : " + res);

        x = 10;
        y = 5;
        res = (x < y) || ( x > 20);
        System.out.println("(x < y) || (x > 20) : " + res);

        System.out.println("*****************************");
        // Oefeningen

        //Oefening 1
        double lang = 12.5;
        double breed = 7.8;

        double oppervlakte = lang * breed;
        System.out.println("De uitkomst : " + oppervlakte);

        //Oefening 2

        boolean bool01 = true;
        boolean bool02 = false;

        System.out.println(bool01 && bool02);
        System.out.println(bool01 || bool02);
        System.out.println(!(bool01 && bool02));

        // Oefening 3

        byte bNum = 10;
        int iNum = 5;
        long lNum = 5L;

        // equal
        boolean equal = bNum == iNum;
        System.out.println("bNum == iNum : " + equal);
        equal = bNum == lNum;
        System.out.println("bNum == lNum : " + equal);
        equal = iNum == lNum;
        System.out.println("iNum == lNum : "+ equal);

        // not equal
        equal = bNum != iNum;
        System.out.println("bNum != iNum" + equal);
        equal = bNum != lNum;
        System.out.println("bNum != lNum : " + equal);
        equal = iNum != lNum;
        System.out.println("iNum != lNum : " + equal);

        // bigger than
        System.out.println("******* Bigger than **********");
        boolean biggerThan = bNum > iNum;
        System.out.println("bNum > iNum : " + biggerThan);
        biggerThan = bNum > lNum;
        System.out.println("bNum > lNum : " + biggerThan);
        biggerThan = iNum > lNum;
        System.out.println("iNum > lNum : " + biggerThan);
        biggerThan = iNum > bNum;
        System.out.println("iNum > bNum : " + biggerThan);

        // smaller than
        System.out.println("******* Smaller than **********");
        boolean smallerThan = bNum < iNum;
        System.out.println("bNum < iNum : " + biggerThan);
        smallerThan = bNum < lNum;
        System.out.println("bNum < lNum : " + biggerThan);
        smallerThan = iNum < lNum;
        System.out.println("iNum < lNum : " + biggerThan);
        smallerThan = iNum < bNum;
        System.out.println("iNum < bNum : " + biggerThan);

        // bigger than or equal
        System.out.println("******* Bigger than or equal **********");
        boolean biggerThanOrEqual = bNum >= iNum;
        System.out.println("bNum >= iNum : " + biggerThanOrEqual);
        biggerThanOrEqual = bNum >= lNum;
        System.out.println("bNum >= lNum : " + biggerThanOrEqual);
        biggerThanOrEqual = iNum >= lNum;
        System.out.println("iNum >= lNum : " + biggerThanOrEqual);
        biggerThanOrEqual = iNum >= bNum;
        System.out.println("iNum >= bNum : " + biggerThanOrEqual);

        // smaller than
        System.out.println("******* Smaller than or equal **********");
        boolean smallerThanOrEqual = bNum <= iNum;
        System.out.println("bNum <= iNum : " + smallerThanOrEqual);
        smallerThanOrEqual = bNum <= lNum;
        System.out.println("bNum <= lNum : " + smallerThanOrEqual);
        smallerThanOrEqual = iNum <= lNum;
        System.out.println("iNum <= lNum : " + smallerThanOrEqual);
        smallerThanOrEqual = iNum <= bNum;
        System.out.println("iNum <= bNum : " + smallerThanOrEqual);




    }

}
