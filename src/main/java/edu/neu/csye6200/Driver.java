package edu.neu.csye6200;

/**
 * @author Anurag
 */
public class Driver {
    public static void main(String[] args) {
        System.out.println("============Main Execution Start===================\n\n");

        //Add your code in between these two print statements
        PeriodicTable.demo();
        System.out.println("\n\n============Main Execution End===================");
    }
}
/**
============Main Execution Start===================



edu.neu.csye6200.PeriodicTable.demo()...
4.2.6
PeriodicTable Development Log 4.2.6
Target classes code addition
Factory classes code addition
Singleton classes code addition
Sort logic code addition
code additions/edits as per requirements
** End of Log Entry List **

elementCSVList  
2,3.49,Helium,He,NOBEL GAS
1,3.99,Hydrogen,H,NONMETAL GAS
80,72.99,Mercury,Hg,METAL LIQUID
8,0.99,Oxygen,O,NONMETAL GAS
7,0.49,Nitrogen,N,NONMETAL GAS
47,89.99,Silver,Ag,METAL SOLID
35,5.99,Bromine,Br,HALOGEN LIQUID
29,55.99,Copper,Cu,METAL SOLID
4,12.99,Potassium,K,ALKALI METAL SOLID
26,42.99,Iron,Fe,METAL SOLID
3,32.99,Lithium,Li,ALKALI METAL SOLID
11,0.49,Sodium,Na,ALKALI METAL SOLID
6,14.99,Carbon,C,NONMETAL SOLID
9,2.49,Flourine,F,HALOGEN GAS
17,1.29,Chlorine,Cl,HALOGEN GAS
79,99.99,Gold,Au,METAL SOLID

elementList  

factoryList  


created elements...
elementCSVList  
2,3.49,Helium,He,NOBEL GAS
1,3.99,Hydrogen,H,NONMETAL GAS
80,72.99,Mercury,Hg,METAL LIQUID
8,0.99,Oxygen,O,NONMETAL GAS
7,0.49,Nitrogen,N,NONMETAL GAS
47,89.99,Silver,Ag,METAL SOLID
35,5.99,Bromine,Br,HALOGEN LIQUID
29,55.99,Copper,Cu,METAL SOLID
4,12.99,Potassium,K,ALKALI METAL SOLID
26,42.99,Iron,Fe,METAL SOLID
3,32.99,Lithium,Li,ALKALI METAL SOLID
11,0.49,Sodium,Na,ALKALI METAL SOLID
6,14.99,Carbon,C,NONMETAL SOLID
9,2.49,Flourine,F,HALOGEN GAS
17,1.29,Chlorine,Cl,HALOGEN GAS
79,99.99,Gold,Au,METAL SOLID

elementList  
Element        #   2 He $ 3.49     Helium            NOBEL GAS
Element        #   1  H $ 3.99   Hydrogen         NONMETAL GAS
Element        #  80 Hg $ 72.99    Mercury         METAL LIQUID
Element        #   8  O $ 0.99     Oxygen         NONMETAL GAS
Element        #   7  N $ 0.49   Nitrogen         NONMETAL GAS
Element        #  47 Ag $ 89.99     Silver          METAL SOLID
Element        #  35 Br $ 5.99    Bromine       HALOGEN LIQUID
Element        #  29 Cu $ 55.99     Copper          METAL SOLID
Element        #   4  K $ 12.99  Potassium   ALKALI METAL SOLID
Element        #  26 Fe $ 42.99       Iron          METAL SOLID
Element        #   3 Li $ 32.99    Lithium   ALKALI METAL SOLID
Element        #  11 Na $ 0.49     Sodium   ALKALI METAL SOLID
Element        #   6  C $ 14.99     Carbon       NONMETAL SOLID
Element        #   9  F $ 2.49   Flourine          HALOGEN GAS
Element        #  17 Cl $ 1.29   Chlorine          HALOGEN GAS
Element        #  79 Au $ 99.99       Gold          METAL SOLID
Element        #   2 He $ 3.49     Helium            NOBEL GAS
Element        #   1  H $ 3.99   Hydrogen         NONMETAL GAS
Element        #  80 Hg $ 72.99    Mercury         METAL LIQUID
Element        #   8  O $ 0.99     Oxygen         NONMETAL GAS
Element        #   7  N $ 0.49   Nitrogen         NONMETAL GAS
Element        #  47 Ag $ 89.99     Silver          METAL SOLID
Element        #  35 Br $ 5.99    Bromine       HALOGEN LIQUID
Element        #  29 Cu $ 55.99     Copper          METAL SOLID
Element        #   4  K $ 12.99  Potassium   ALKALI METAL SOLID
Element        #  26 Fe $ 42.99       Iron          METAL SOLID
Element        #   3 Li $ 32.99    Lithium   ALKALI METAL SOLID
Element        #  11 Na $ 0.49     Sodium   ALKALI METAL SOLID
Element        #   6  C $ 14.99     Carbon       NONMETAL SOLID
Element        #   9  F $ 2.49   Flourine          HALOGEN GAS
Element        #  17 Cl $ 1.29   Chlorine          HALOGEN GAS
Element        #  79 Au $ 99.99       Gold          METAL SOLID
SolidElement   #  47 Ag $ 89.99     Silver          METAL SOLID
SolidElement   #  29 Cu $ 55.99     Copper          METAL SOLID
SolidElement   #   4  K $ 12.99  Potassium   ALKALI METAL SOLID
SolidElement   #  26 Fe $ 42.99       Iron          METAL SOLID
SolidElement   #   3 Li $ 32.99    Lithium   ALKALI METAL SOLID
SolidElement   #  11 Na $ 0.49     Sodium   ALKALI METAL SOLID
SolidElement   #   6  C $ 14.99     Carbon       NONMETAL SOLID
SolidElement   #  79 Au $ 99.99       Gold          METAL SOLID
SolidElement   #  47 Ag $ 89.99     Silver          METAL SOLID
SolidElement   #  29 Cu $ 55.99     Copper          METAL SOLID
SolidElement   #   4  K $ 12.99  Potassium   ALKALI METAL SOLID
SolidElement   #  26 Fe $ 42.99       Iron          METAL SOLID
SolidElement   #   3 Li $ 32.99    Lithium   ALKALI METAL SOLID
SolidElement   #  11 Na $ 0.49     Sodium   ALKALI METAL SOLID
SolidElement   #   6  C $ 14.99     Carbon       NONMETAL SOLID
SolidElement   #  79 Au $ 99.99       Gold          METAL SOLID
GaseousElement #   2 He $ 3.49     Helium            NOBEL GAS
GaseousElement #   1  H $ 3.99   Hydrogen         NONMETAL GAS
GaseousElement #   8  O $ 0.99     Oxygen         NONMETAL GAS
GaseousElement #   7  N $ 0.49   Nitrogen         NONMETAL GAS
GaseousElement #   9  F $ 2.49   Flourine          HALOGEN GAS
GaseousElement #  17 Cl $ 1.29   Chlorine          HALOGEN GAS
GaseousElement #   2 He $ 3.49     Helium            NOBEL GAS
GaseousElement #   1  H $ 3.99   Hydrogen         NONMETAL GAS
GaseousElement #   8  O $ 0.99     Oxygen         NONMETAL GAS
GaseousElement #   7  N $ 0.49   Nitrogen         NONMETAL GAS
GaseousElement #   9  F $ 2.49   Flourine          HALOGEN GAS
GaseousElement #  17 Cl $ 1.29   Chlorine          HALOGEN GAS
LiquidElement  #  80 Hg $ 72.99    Mercury         METAL LIQUID
LiquidElement  #  35 Br $ 5.99    Bromine       HALOGEN LIQUID
LiquidElement  #  80 Hg $ 72.99    Mercury         METAL LIQUID
LiquidElement  #  35 Br $ 5.99    Bromine       HALOGEN LIQUID

factoryList  
ElementFactory
ElementFactory
SolidElementFactory
SolidElementFactory
GaseousElementFactory
GaseousElementFactory
LiquidElementFactory
LiquidElementFactory



SORT PeriodicTable elements in DEFAULT order...
elementCSVList  
2,3.49,Helium,He,NOBEL GAS
1,3.99,Hydrogen,H,NONMETAL GAS
80,72.99,Mercury,Hg,METAL LIQUID
8,0.99,Oxygen,O,NONMETAL GAS
7,0.49,Nitrogen,N,NONMETAL GAS
47,89.99,Silver,Ag,METAL SOLID
35,5.99,Bromine,Br,HALOGEN LIQUID
29,55.99,Copper,Cu,METAL SOLID
4,12.99,Potassium,K,ALKALI METAL SOLID
26,42.99,Iron,Fe,METAL SOLID
3,32.99,Lithium,Li,ALKALI METAL SOLID
11,0.49,Sodium,Na,ALKALI METAL SOLID
6,14.99,Carbon,C,NONMETAL SOLID
9,2.49,Flourine,F,HALOGEN GAS
17,1.29,Chlorine,Cl,HALOGEN GAS
79,99.99,Gold,Au,METAL SOLID

elementList  
Element        #   7  N $ 0.49   Nitrogen         NONMETAL GAS
Element        #  11 Na $ 0.49     Sodium   ALKALI METAL SOLID
Element        #   7  N $ 0.49   Nitrogen         NONMETAL GAS
Element        #  11 Na $ 0.49     Sodium   ALKALI METAL SOLID
SolidElement   #  11 Na $ 0.49     Sodium   ALKALI METAL SOLID
SolidElement   #  11 Na $ 0.49     Sodium   ALKALI METAL SOLID
GaseousElement #   7  N $ 0.49   Nitrogen         NONMETAL GAS
GaseousElement #   7  N $ 0.49   Nitrogen         NONMETAL GAS
Element        #   8  O $ 0.99     Oxygen         NONMETAL GAS
Element        #   8  O $ 0.99     Oxygen         NONMETAL GAS
GaseousElement #   8  O $ 0.99     Oxygen         NONMETAL GAS
GaseousElement #   8  O $ 0.99     Oxygen         NONMETAL GAS
Element        #  17 Cl $ 1.29   Chlorine          HALOGEN GAS
Element        #  17 Cl $ 1.29   Chlorine          HALOGEN GAS
GaseousElement #  17 Cl $ 1.29   Chlorine          HALOGEN GAS
GaseousElement #  17 Cl $ 1.29   Chlorine          HALOGEN GAS
Element        #   9  F $ 2.49   Flourine          HALOGEN GAS
Element        #   9  F $ 2.49   Flourine          HALOGEN GAS
GaseousElement #   9  F $ 2.49   Flourine          HALOGEN GAS
GaseousElement #   9  F $ 2.49   Flourine          HALOGEN GAS
Element        #   2 He $ 3.49     Helium            NOBEL GAS
Element        #   2 He $ 3.49     Helium            NOBEL GAS
GaseousElement #   2 He $ 3.49     Helium            NOBEL GAS
GaseousElement #   2 He $ 3.49     Helium            NOBEL GAS
Element        #   1  H $ 3.99   Hydrogen         NONMETAL GAS
Element        #   1  H $ 3.99   Hydrogen         NONMETAL GAS
GaseousElement #   1  H $ 3.99   Hydrogen         NONMETAL GAS
GaseousElement #   1  H $ 3.99   Hydrogen         NONMETAL GAS
Element        #  35 Br $ 5.99    Bromine       HALOGEN LIQUID
Element        #  35 Br $ 5.99    Bromine       HALOGEN LIQUID
LiquidElement  #  35 Br $ 5.99    Bromine       HALOGEN LIQUID
LiquidElement  #  35 Br $ 5.99    Bromine       HALOGEN LIQUID
Element        #   4  K $ 12.99  Potassium   ALKALI METAL SOLID
Element        #   4  K $ 12.99  Potassium   ALKALI METAL SOLID
SolidElement   #   4  K $ 12.99  Potassium   ALKALI METAL SOLID
SolidElement   #   4  K $ 12.99  Potassium   ALKALI METAL SOLID
Element        #   6  C $ 14.99     Carbon       NONMETAL SOLID
Element        #   6  C $ 14.99     Carbon       NONMETAL SOLID
SolidElement   #   6  C $ 14.99     Carbon       NONMETAL SOLID
SolidElement   #   6  C $ 14.99     Carbon       NONMETAL SOLID
Element        #   3 Li $ 32.99    Lithium   ALKALI METAL SOLID
Element        #   3 Li $ 32.99    Lithium   ALKALI METAL SOLID
SolidElement   #   3 Li $ 32.99    Lithium   ALKALI METAL SOLID
SolidElement   #   3 Li $ 32.99    Lithium   ALKALI METAL SOLID
Element        #  26 Fe $ 42.99       Iron          METAL SOLID
Element        #  26 Fe $ 42.99       Iron          METAL SOLID
SolidElement   #  26 Fe $ 42.99       Iron          METAL SOLID
SolidElement   #  26 Fe $ 42.99       Iron          METAL SOLID
Element        #  29 Cu $ 55.99     Copper          METAL SOLID
Element        #  29 Cu $ 55.99     Copper          METAL SOLID
SolidElement   #  29 Cu $ 55.99     Copper          METAL SOLID
SolidElement   #  29 Cu $ 55.99     Copper          METAL SOLID
Element        #  80 Hg $ 72.99    Mercury         METAL LIQUID
Element        #  80 Hg $ 72.99    Mercury         METAL LIQUID
LiquidElement  #  80 Hg $ 72.99    Mercury         METAL LIQUID
LiquidElement  #  80 Hg $ 72.99    Mercury         METAL LIQUID
Element        #  47 Ag $ 89.99     Silver          METAL SOLID
Element        #  47 Ag $ 89.99     Silver          METAL SOLID
SolidElement   #  47 Ag $ 89.99     Silver          METAL SOLID
SolidElement   #  47 Ag $ 89.99     Silver          METAL SOLID
Element        #  79 Au $ 99.99       Gold          METAL SOLID
Element        #  79 Au $ 99.99       Gold          METAL SOLID
SolidElement   #  79 Au $ 99.99       Gold          METAL SOLID
SolidElement   #  79 Au $ 99.99       Gold          METAL SOLID

factoryList  
ElementFactory
ElementFactory
SolidElementFactory
SolidElementFactory
GaseousElementFactory
GaseousElementFactory
LiquidElementFactory
LiquidElementFactory



SORT PeriodicTable elements by AtomicNumber...
elementCSVList  
2,3.49,Helium,He,NOBEL GAS
1,3.99,Hydrogen,H,NONMETAL GAS
80,72.99,Mercury,Hg,METAL LIQUID
8,0.99,Oxygen,O,NONMETAL GAS
7,0.49,Nitrogen,N,NONMETAL GAS
47,89.99,Silver,Ag,METAL SOLID
35,5.99,Bromine,Br,HALOGEN LIQUID
29,55.99,Copper,Cu,METAL SOLID
4,12.99,Potassium,K,ALKALI METAL SOLID
26,42.99,Iron,Fe,METAL SOLID
3,32.99,Lithium,Li,ALKALI METAL SOLID
11,0.49,Sodium,Na,ALKALI METAL SOLID
6,14.99,Carbon,C,NONMETAL SOLID
9,2.49,Flourine,F,HALOGEN GAS
17,1.29,Chlorine,Cl,HALOGEN GAS
79,99.99,Gold,Au,METAL SOLID

elementList  
Element        #   1  H $ 3.99   Hydrogen         NONMETAL GAS
Element        #   1  H $ 3.99   Hydrogen         NONMETAL GAS
GaseousElement #   1  H $ 3.99   Hydrogen         NONMETAL GAS
GaseousElement #   1  H $ 3.99   Hydrogen         NONMETAL GAS
Element        #   2 He $ 3.49     Helium            NOBEL GAS
Element        #   2 He $ 3.49     Helium            NOBEL GAS
GaseousElement #   2 He $ 3.49     Helium            NOBEL GAS
GaseousElement #   2 He $ 3.49     Helium            NOBEL GAS
Element        #   3 Li $ 32.99    Lithium   ALKALI METAL SOLID
Element        #   3 Li $ 32.99    Lithium   ALKALI METAL SOLID
SolidElement   #   3 Li $ 32.99    Lithium   ALKALI METAL SOLID
SolidElement   #   3 Li $ 32.99    Lithium   ALKALI METAL SOLID
Element        #   4  K $ 12.99  Potassium   ALKALI METAL SOLID
Element        #   4  K $ 12.99  Potassium   ALKALI METAL SOLID
SolidElement   #   4  K $ 12.99  Potassium   ALKALI METAL SOLID
SolidElement   #   4  K $ 12.99  Potassium   ALKALI METAL SOLID
Element        #   6  C $ 14.99     Carbon       NONMETAL SOLID
Element        #   6  C $ 14.99     Carbon       NONMETAL SOLID
SolidElement   #   6  C $ 14.99     Carbon       NONMETAL SOLID
SolidElement   #   6  C $ 14.99     Carbon       NONMETAL SOLID
Element        #   7  N $ 0.49   Nitrogen         NONMETAL GAS
Element        #   7  N $ 0.49   Nitrogen         NONMETAL GAS
GaseousElement #   7  N $ 0.49   Nitrogen         NONMETAL GAS
GaseousElement #   7  N $ 0.49   Nitrogen         NONMETAL GAS
Element        #   8  O $ 0.99     Oxygen         NONMETAL GAS
Element        #   8  O $ 0.99     Oxygen         NONMETAL GAS
GaseousElement #   8  O $ 0.99     Oxygen         NONMETAL GAS
GaseousElement #   8  O $ 0.99     Oxygen         NONMETAL GAS
Element        #   9  F $ 2.49   Flourine          HALOGEN GAS
Element        #   9  F $ 2.49   Flourine          HALOGEN GAS
GaseousElement #   9  F $ 2.49   Flourine          HALOGEN GAS
GaseousElement #   9  F $ 2.49   Flourine          HALOGEN GAS
Element        #  11 Na $ 0.49     Sodium   ALKALI METAL SOLID
Element        #  11 Na $ 0.49     Sodium   ALKALI METAL SOLID
SolidElement   #  11 Na $ 0.49     Sodium   ALKALI METAL SOLID
SolidElement   #  11 Na $ 0.49     Sodium   ALKALI METAL SOLID
Element        #  17 Cl $ 1.29   Chlorine          HALOGEN GAS
Element        #  17 Cl $ 1.29   Chlorine          HALOGEN GAS
GaseousElement #  17 Cl $ 1.29   Chlorine          HALOGEN GAS
GaseousElement #  17 Cl $ 1.29   Chlorine          HALOGEN GAS
Element        #  26 Fe $ 42.99       Iron          METAL SOLID
Element        #  26 Fe $ 42.99       Iron          METAL SOLID
SolidElement   #  26 Fe $ 42.99       Iron          METAL SOLID
SolidElement   #  26 Fe $ 42.99       Iron          METAL SOLID
Element        #  29 Cu $ 55.99     Copper          METAL SOLID
Element        #  29 Cu $ 55.99     Copper          METAL SOLID
SolidElement   #  29 Cu $ 55.99     Copper          METAL SOLID
SolidElement   #  29 Cu $ 55.99     Copper          METAL SOLID
Element        #  35 Br $ 5.99    Bromine       HALOGEN LIQUID
Element        #  35 Br $ 5.99    Bromine       HALOGEN LIQUID
LiquidElement  #  35 Br $ 5.99    Bromine       HALOGEN LIQUID
LiquidElement  #  35 Br $ 5.99    Bromine       HALOGEN LIQUID
Element        #  47 Ag $ 89.99     Silver          METAL SOLID
Element        #  47 Ag $ 89.99     Silver          METAL SOLID
SolidElement   #  47 Ag $ 89.99     Silver          METAL SOLID
SolidElement   #  47 Ag $ 89.99     Silver          METAL SOLID
Element        #  79 Au $ 99.99       Gold          METAL SOLID
Element        #  79 Au $ 99.99       Gold          METAL SOLID
SolidElement   #  79 Au $ 99.99       Gold          METAL SOLID
SolidElement   #  79 Au $ 99.99       Gold          METAL SOLID
Element        #  80 Hg $ 72.99    Mercury         METAL LIQUID
Element        #  80 Hg $ 72.99    Mercury         METAL LIQUID
LiquidElement  #  80 Hg $ 72.99    Mercury         METAL LIQUID
LiquidElement  #  80 Hg $ 72.99    Mercury         METAL LIQUID

factoryList  
ElementFactory
ElementFactory
SolidElementFactory
SolidElementFactory
GaseousElementFactory
GaseousElementFactory
LiquidElementFactory
LiquidElementFactory



SORT PeriodicTable elements by Symbol...
elementCSVList  
2,3.49,Helium,He,NOBEL GAS
1,3.99,Hydrogen,H,NONMETAL GAS
80,72.99,Mercury,Hg,METAL LIQUID
8,0.99,Oxygen,O,NONMETAL GAS
7,0.49,Nitrogen,N,NONMETAL GAS
47,89.99,Silver,Ag,METAL SOLID
35,5.99,Bromine,Br,HALOGEN LIQUID
29,55.99,Copper,Cu,METAL SOLID
4,12.99,Potassium,K,ALKALI METAL SOLID
26,42.99,Iron,Fe,METAL SOLID
3,32.99,Lithium,Li,ALKALI METAL SOLID
11,0.49,Sodium,Na,ALKALI METAL SOLID
6,14.99,Carbon,C,NONMETAL SOLID
9,2.49,Flourine,F,HALOGEN GAS
17,1.29,Chlorine,Cl,HALOGEN GAS
79,99.99,Gold,Au,METAL SOLID

elementList  
Element        #  47 Ag $ 89.99     Silver          METAL SOLID
Element        #  47 Ag $ 89.99     Silver          METAL SOLID
SolidElement   #  47 Ag $ 89.99     Silver          METAL SOLID
SolidElement   #  47 Ag $ 89.99     Silver          METAL SOLID
Element        #  79 Au $ 99.99       Gold          METAL SOLID
Element        #  79 Au $ 99.99       Gold          METAL SOLID
SolidElement   #  79 Au $ 99.99       Gold          METAL SOLID
SolidElement   #  79 Au $ 99.99       Gold          METAL SOLID
Element        #  35 Br $ 5.99    Bromine       HALOGEN LIQUID
Element        #  35 Br $ 5.99    Bromine       HALOGEN LIQUID
LiquidElement  #  35 Br $ 5.99    Bromine       HALOGEN LIQUID
LiquidElement  #  35 Br $ 5.99    Bromine       HALOGEN LIQUID
Element        #   6  C $ 14.99     Carbon       NONMETAL SOLID
Element        #   6  C $ 14.99     Carbon       NONMETAL SOLID
SolidElement   #   6  C $ 14.99     Carbon       NONMETAL SOLID
SolidElement   #   6  C $ 14.99     Carbon       NONMETAL SOLID
Element        #  17 Cl $ 1.29   Chlorine          HALOGEN GAS
Element        #  17 Cl $ 1.29   Chlorine          HALOGEN GAS
GaseousElement #  17 Cl $ 1.29   Chlorine          HALOGEN GAS
GaseousElement #  17 Cl $ 1.29   Chlorine          HALOGEN GAS
Element        #  29 Cu $ 55.99     Copper          METAL SOLID
Element        #  29 Cu $ 55.99     Copper          METAL SOLID
SolidElement   #  29 Cu $ 55.99     Copper          METAL SOLID
SolidElement   #  29 Cu $ 55.99     Copper          METAL SOLID
Element        #   9  F $ 2.49   Flourine          HALOGEN GAS
Element        #   9  F $ 2.49   Flourine          HALOGEN GAS
GaseousElement #   9  F $ 2.49   Flourine          HALOGEN GAS
GaseousElement #   9  F $ 2.49   Flourine          HALOGEN GAS
Element        #  26 Fe $ 42.99       Iron          METAL SOLID
Element        #  26 Fe $ 42.99       Iron          METAL SOLID
SolidElement   #  26 Fe $ 42.99       Iron          METAL SOLID
SolidElement   #  26 Fe $ 42.99       Iron          METAL SOLID
Element        #   1  H $ 3.99   Hydrogen         NONMETAL GAS
Element        #   1  H $ 3.99   Hydrogen         NONMETAL GAS
GaseousElement #   1  H $ 3.99   Hydrogen         NONMETAL GAS
GaseousElement #   1  H $ 3.99   Hydrogen         NONMETAL GAS
Element        #   2 He $ 3.49     Helium            NOBEL GAS
Element        #   2 He $ 3.49     Helium            NOBEL GAS
GaseousElement #   2 He $ 3.49     Helium            NOBEL GAS
GaseousElement #   2 He $ 3.49     Helium            NOBEL GAS
Element        #  80 Hg $ 72.99    Mercury         METAL LIQUID
Element        #  80 Hg $ 72.99    Mercury         METAL LIQUID
LiquidElement  #  80 Hg $ 72.99    Mercury         METAL LIQUID
LiquidElement  #  80 Hg $ 72.99    Mercury         METAL LIQUID
Element        #   4  K $ 12.99  Potassium   ALKALI METAL SOLID
Element        #   4  K $ 12.99  Potassium   ALKALI METAL SOLID
SolidElement   #   4  K $ 12.99  Potassium   ALKALI METAL SOLID
SolidElement   #   4  K $ 12.99  Potassium   ALKALI METAL SOLID
Element        #   3 Li $ 32.99    Lithium   ALKALI METAL SOLID
Element        #   3 Li $ 32.99    Lithium   ALKALI METAL SOLID
SolidElement   #   3 Li $ 32.99    Lithium   ALKALI METAL SOLID
SolidElement   #   3 Li $ 32.99    Lithium   ALKALI METAL SOLID
Element        #   7  N $ 0.49   Nitrogen         NONMETAL GAS
Element        #   7  N $ 0.49   Nitrogen         NONMETAL GAS
GaseousElement #   7  N $ 0.49   Nitrogen         NONMETAL GAS
GaseousElement #   7  N $ 0.49   Nitrogen         NONMETAL GAS
Element        #  11 Na $ 0.49     Sodium   ALKALI METAL SOLID
Element        #  11 Na $ 0.49     Sodium   ALKALI METAL SOLID
SolidElement   #  11 Na $ 0.49     Sodium   ALKALI METAL SOLID
SolidElement   #  11 Na $ 0.49     Sodium   ALKALI METAL SOLID
Element        #   8  O $ 0.99     Oxygen         NONMETAL GAS
Element        #   8  O $ 0.99     Oxygen         NONMETAL GAS
GaseousElement #   8  O $ 0.99     Oxygen         NONMETAL GAS
GaseousElement #   8  O $ 0.99     Oxygen         NONMETAL GAS

factoryList  
ElementFactory
ElementFactory
SolidElementFactory
SolidElementFactory
GaseousElementFactory
GaseousElementFactory
LiquidElementFactory
LiquidElementFactory



PeriodicTable Book elements by NAME...
elementCSVList  
2,3.49,Helium,He,NOBEL GAS
1,3.99,Hydrogen,H,NONMETAL GAS
80,72.99,Mercury,Hg,METAL LIQUID
8,0.99,Oxygen,O,NONMETAL GAS
7,0.49,Nitrogen,N,NONMETAL GAS
47,89.99,Silver,Ag,METAL SOLID
35,5.99,Bromine,Br,HALOGEN LIQUID
29,55.99,Copper,Cu,METAL SOLID
4,12.99,Potassium,K,ALKALI METAL SOLID
26,42.99,Iron,Fe,METAL SOLID
3,32.99,Lithium,Li,ALKALI METAL SOLID
11,0.49,Sodium,Na,ALKALI METAL SOLID
6,14.99,Carbon,C,NONMETAL SOLID
9,2.49,Flourine,F,HALOGEN GAS
17,1.29,Chlorine,Cl,HALOGEN GAS
79,99.99,Gold,Au,METAL SOLID

elementList  
Element        #  35 Br $ 5.99    Bromine       HALOGEN LIQUID
Element        #  35 Br $ 5.99    Bromine       HALOGEN LIQUID
LiquidElement  #  35 Br $ 5.99    Bromine       HALOGEN LIQUID
LiquidElement  #  35 Br $ 5.99    Bromine       HALOGEN LIQUID
Element        #   6  C $ 14.99     Carbon       NONMETAL SOLID
Element        #   6  C $ 14.99     Carbon       NONMETAL SOLID
SolidElement   #   6  C $ 14.99     Carbon       NONMETAL SOLID
SolidElement   #   6  C $ 14.99     Carbon       NONMETAL SOLID
Element        #  17 Cl $ 1.29   Chlorine          HALOGEN GAS
Element        #  17 Cl $ 1.29   Chlorine          HALOGEN GAS
GaseousElement #  17 Cl $ 1.29   Chlorine          HALOGEN GAS
GaseousElement #  17 Cl $ 1.29   Chlorine          HALOGEN GAS
Element        #  29 Cu $ 55.99     Copper          METAL SOLID
Element        #  29 Cu $ 55.99     Copper          METAL SOLID
SolidElement   #  29 Cu $ 55.99     Copper          METAL SOLID
SolidElement   #  29 Cu $ 55.99     Copper          METAL SOLID
Element        #   9  F $ 2.49   Flourine          HALOGEN GAS
Element        #   9  F $ 2.49   Flourine          HALOGEN GAS
GaseousElement #   9  F $ 2.49   Flourine          HALOGEN GAS
GaseousElement #   9  F $ 2.49   Flourine          HALOGEN GAS
Element        #  79 Au $ 99.99       Gold          METAL SOLID
Element        #  79 Au $ 99.99       Gold          METAL SOLID
SolidElement   #  79 Au $ 99.99       Gold          METAL SOLID
SolidElement   #  79 Au $ 99.99       Gold          METAL SOLID
Element        #   2 He $ 3.49     Helium            NOBEL GAS
Element        #   2 He $ 3.49     Helium            NOBEL GAS
GaseousElement #   2 He $ 3.49     Helium            NOBEL GAS
GaseousElement #   2 He $ 3.49     Helium            NOBEL GAS
Element        #   1  H $ 3.99   Hydrogen         NONMETAL GAS
Element        #   1  H $ 3.99   Hydrogen         NONMETAL GAS
GaseousElement #   1  H $ 3.99   Hydrogen         NONMETAL GAS
GaseousElement #   1  H $ 3.99   Hydrogen         NONMETAL GAS
Element        #  26 Fe $ 42.99       Iron          METAL SOLID
Element        #  26 Fe $ 42.99       Iron          METAL SOLID
SolidElement   #  26 Fe $ 42.99       Iron          METAL SOLID
SolidElement   #  26 Fe $ 42.99       Iron          METAL SOLID
Element        #   3 Li $ 32.99    Lithium   ALKALI METAL SOLID
Element        #   3 Li $ 32.99    Lithium   ALKALI METAL SOLID
SolidElement   #   3 Li $ 32.99    Lithium   ALKALI METAL SOLID
SolidElement   #   3 Li $ 32.99    Lithium   ALKALI METAL SOLID
Element        #  80 Hg $ 72.99    Mercury         METAL LIQUID
Element        #  80 Hg $ 72.99    Mercury         METAL LIQUID
LiquidElement  #  80 Hg $ 72.99    Mercury         METAL LIQUID
LiquidElement  #  80 Hg $ 72.99    Mercury         METAL LIQUID
Element        #   7  N $ 0.49   Nitrogen         NONMETAL GAS
Element        #   7  N $ 0.49   Nitrogen         NONMETAL GAS
GaseousElement #   7  N $ 0.49   Nitrogen         NONMETAL GAS
GaseousElement #   7  N $ 0.49   Nitrogen         NONMETAL GAS
Element        #   8  O $ 0.99     Oxygen         NONMETAL GAS
Element        #   8  O $ 0.99     Oxygen         NONMETAL GAS
GaseousElement #   8  O $ 0.99     Oxygen         NONMETAL GAS
GaseousElement #   8  O $ 0.99     Oxygen         NONMETAL GAS
Element        #   4  K $ 12.99  Potassium   ALKALI METAL SOLID
Element        #   4  K $ 12.99  Potassium   ALKALI METAL SOLID
SolidElement   #   4  K $ 12.99  Potassium   ALKALI METAL SOLID
SolidElement   #   4  K $ 12.99  Potassium   ALKALI METAL SOLID
Element        #  47 Ag $ 89.99     Silver          METAL SOLID
Element        #  47 Ag $ 89.99     Silver          METAL SOLID
SolidElement   #  47 Ag $ 89.99     Silver          METAL SOLID
SolidElement   #  47 Ag $ 89.99     Silver          METAL SOLID
Element        #  11 Na $ 0.49     Sodium   ALKALI METAL SOLID
Element        #  11 Na $ 0.49     Sodium   ALKALI METAL SOLID
SolidElement   #  11 Na $ 0.49     Sodium   ALKALI METAL SOLID
SolidElement   #  11 Na $ 0.49     Sodium   ALKALI METAL SOLID

factoryList  
ElementFactory
ElementFactory
SolidElementFactory
SolidElementFactory
GaseousElementFactory
GaseousElementFactory
LiquidElementFactory
LiquidElementFactory



PeriodicTable Book elements by DESCRIPTION...
elementCSVList  
2,3.49,Helium,He,NOBEL GAS
1,3.99,Hydrogen,H,NONMETAL GAS
80,72.99,Mercury,Hg,METAL LIQUID
8,0.99,Oxygen,O,NONMETAL GAS
7,0.49,Nitrogen,N,NONMETAL GAS
47,89.99,Silver,Ag,METAL SOLID
35,5.99,Bromine,Br,HALOGEN LIQUID
29,55.99,Copper,Cu,METAL SOLID
4,12.99,Potassium,K,ALKALI METAL SOLID
26,42.99,Iron,Fe,METAL SOLID
3,32.99,Lithium,Li,ALKALI METAL SOLID
11,0.49,Sodium,Na,ALKALI METAL SOLID
6,14.99,Carbon,C,NONMETAL SOLID
9,2.49,Flourine,F,HALOGEN GAS
17,1.29,Chlorine,Cl,HALOGEN GAS
79,99.99,Gold,Au,METAL SOLID

elementList  
Element        #   3 Li $ 32.99    Lithium   ALKALI METAL SOLID
Element        #   3 Li $ 32.99    Lithium   ALKALI METAL SOLID
SolidElement   #   3 Li $ 32.99    Lithium   ALKALI METAL SOLID
SolidElement   #   3 Li $ 32.99    Lithium   ALKALI METAL SOLID
Element        #   4  K $ 12.99  Potassium   ALKALI METAL SOLID
Element        #   4  K $ 12.99  Potassium   ALKALI METAL SOLID
SolidElement   #   4  K $ 12.99  Potassium   ALKALI METAL SOLID
SolidElement   #   4  K $ 12.99  Potassium   ALKALI METAL SOLID
Element        #  11 Na $ 0.49     Sodium   ALKALI METAL SOLID
Element        #  11 Na $ 0.49     Sodium   ALKALI METAL SOLID
SolidElement   #  11 Na $ 0.49     Sodium   ALKALI METAL SOLID
SolidElement   #  11 Na $ 0.49     Sodium   ALKALI METAL SOLID
Element        #  17 Cl $ 1.29   Chlorine          HALOGEN GAS
Element        #  17 Cl $ 1.29   Chlorine          HALOGEN GAS
GaseousElement #  17 Cl $ 1.29   Chlorine          HALOGEN GAS
GaseousElement #  17 Cl $ 1.29   Chlorine          HALOGEN GAS
Element        #   9  F $ 2.49   Flourine          HALOGEN GAS
Element        #   9  F $ 2.49   Flourine          HALOGEN GAS
GaseousElement #   9  F $ 2.49   Flourine          HALOGEN GAS
GaseousElement #   9  F $ 2.49   Flourine          HALOGEN GAS
Element        #  35 Br $ 5.99    Bromine       HALOGEN LIQUID
Element        #  35 Br $ 5.99    Bromine       HALOGEN LIQUID
LiquidElement  #  35 Br $ 5.99    Bromine       HALOGEN LIQUID
LiquidElement  #  35 Br $ 5.99    Bromine       HALOGEN LIQUID
Element        #  80 Hg $ 72.99    Mercury         METAL LIQUID
Element        #  80 Hg $ 72.99    Mercury         METAL LIQUID
LiquidElement  #  80 Hg $ 72.99    Mercury         METAL LIQUID
LiquidElement  #  80 Hg $ 72.99    Mercury         METAL LIQUID
Element        #  29 Cu $ 55.99     Copper          METAL SOLID
Element        #  29 Cu $ 55.99     Copper          METAL SOLID
SolidElement   #  29 Cu $ 55.99     Copper          METAL SOLID
SolidElement   #  29 Cu $ 55.99     Copper          METAL SOLID
Element        #  79 Au $ 99.99       Gold          METAL SOLID
Element        #  79 Au $ 99.99       Gold          METAL SOLID
SolidElement   #  79 Au $ 99.99       Gold          METAL SOLID
SolidElement   #  79 Au $ 99.99       Gold          METAL SOLID
Element        #  26 Fe $ 42.99       Iron          METAL SOLID
Element        #  26 Fe $ 42.99       Iron          METAL SOLID
SolidElement   #  26 Fe $ 42.99       Iron          METAL SOLID
SolidElement   #  26 Fe $ 42.99       Iron          METAL SOLID
Element        #  47 Ag $ 89.99     Silver          METAL SOLID
Element        #  47 Ag $ 89.99     Silver          METAL SOLID
SolidElement   #  47 Ag $ 89.99     Silver          METAL SOLID
SolidElement   #  47 Ag $ 89.99     Silver          METAL SOLID
Element        #   2 He $ 3.49     Helium            NOBEL GAS
Element        #   2 He $ 3.49     Helium            NOBEL GAS
GaseousElement #   2 He $ 3.49     Helium            NOBEL GAS
GaseousElement #   2 He $ 3.49     Helium            NOBEL GAS
Element        #   1  H $ 3.99   Hydrogen         NONMETAL GAS
Element        #   1  H $ 3.99   Hydrogen         NONMETAL GAS
GaseousElement #   1  H $ 3.99   Hydrogen         NONMETAL GAS
GaseousElement #   1  H $ 3.99   Hydrogen         NONMETAL GAS
Element        #   7  N $ 0.49   Nitrogen         NONMETAL GAS
Element        #   7  N $ 0.49   Nitrogen         NONMETAL GAS
GaseousElement #   7  N $ 0.49   Nitrogen         NONMETAL GAS
GaseousElement #   7  N $ 0.49   Nitrogen         NONMETAL GAS
Element        #   8  O $ 0.99     Oxygen         NONMETAL GAS
Element        #   8  O $ 0.99     Oxygen         NONMETAL GAS
GaseousElement #   8  O $ 0.99     Oxygen         NONMETAL GAS
GaseousElement #   8  O $ 0.99     Oxygen         NONMETAL GAS
Element        #   6  C $ 14.99     Carbon       NONMETAL SOLID
Element        #   6  C $ 14.99     Carbon       NONMETAL SOLID
SolidElement   #   6  C $ 14.99     Carbon       NONMETAL SOLID
SolidElement   #   6  C $ 14.99     Carbon       NONMETAL SOLID

factoryList  
ElementFactory
ElementFactory
SolidElementFactory
SolidElementFactory
GaseousElementFactory
GaseousElementFactory
LiquidElementFactory
LiquidElementFactory




edu.neu.csye6200.PeriodicTable.demo()...done!


============Main Execution End===================
**/