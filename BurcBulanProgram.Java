package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int month, day;
        String Burc= "";
        Boolean isEror= false;

        // boolean isErrors

        Scanner scanner = new Scanner(System.in);

        System.out.print("Do�du�unuz Ay� giriniz : ");
        month = scanner.nextInt();

        System.out.print("Do�du�unuz g�n� giriniz :  ");
        day = scanner.nextInt();



        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                       Burc ="O�lak";
                    } else {
                       Burc="kova";
                    }

                } else {
                    isEror=true;
                }
                break;
            case 2:
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        Burc= "Kova";
                    } else {
                        Burc ="Bal�k";
                    }
                } else {
                   isEror =true;
                }
                break;
            case 3:
                if (day >= 1 && day <= 31) {
                if (day < 21) {
                    Burc = "Bal�k";
                } else {
                    Burc="ko�";
                }
            } else {
                isEror=true;
            }
            break;
            case 4:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        Burc = "Ko�";
                    } else {
                        Burc="Bo�a";
                    }
                } else {
                    isEror=true;
                }
                break;
            case 5:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        Burc = "Bo�a";
                    } else {
                        Burc="�kizler";
                    }
                } else {
                    isEror=true;
                }
                break;
            case 6:
                if (day >= 1 && day < 31) {
                    if (day < 23) {
                        Burc = "�kizler";
                    } else {
                        Burc="Yenge�";
                    }
                } else {
                    isEror=true;
                }
                break;
            case 7:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        Burc = "Yenge�";
                    } else {
                        Burc="Aslan";
                    }
                } else {
                    isEror=true;
                }
                break;
            case 8:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        Burc = "Aslan";
                    } else {
                        Burc="Ba�ak";
                    }
                } else {
                    isEror=true;
                }
                break;
            case 9:
                if (day >= 1 && day < 31) {
                    if (day < 23) {
                        Burc = "Ba�ak";
                    } else {
                        Burc="Terazi";
                    }
                } else {
                    isEror=true;
                }
                break;
            case 10:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        Burc = "Terazi";
                    } else {
                        Burc="Akrep";
                    }
                } else {
                    isEror=true;
                }
                break;
            case 11:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        Burc = "Akrep";
                    } else {
                        Burc="Yay";
                    }
                } else {
                    isEror=true;
                }
                break;
            case 12:
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        Burc = "Yay";
                    } else {
                        Burc="O�lak";
                    }
                } else {
                    isEror=true;
                }
                break;

        }

    }
}
