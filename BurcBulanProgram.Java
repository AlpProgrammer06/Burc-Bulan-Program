package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int month, day;
        String Burc= "";
        Boolean isEror= false;

        // boolean isErrors

        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğduğunuz Ayı giriniz : ");
        month = scanner.nextInt();

        System.out.print("Doğduğunuz günü giriniz :  ");
        day = scanner.nextInt();



        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                       Burc ="Oğlak";
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
                        Burc ="Balık";
                    }
                } else {
                   isEror =true;
                }
                break;
            case 3:
                if (day >= 1 && day <= 31) {
                if (day < 21) {
                    Burc = "Balık";
                } else {
                    Burc="koç";
                }
            } else {
                isEror=true;
            }
            break;
            case 4:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        Burc = "Koç";
                    } else {
                        Burc="Boğa";
                    }
                } else {
                    isEror=true;
                }
                break;
            case 5:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        Burc = "Boğa";
                    } else {
                        Burc="İkizler";
                    }
                } else {
                    isEror=true;
                }
                break;
            case 6:
                if (day >= 1 && day < 31) {
                    if (day < 23) {
                        Burc = "İkizler";
                    } else {
                        Burc="Yengeç";
                    }
                } else {
                    isEror=true;
                }
                break;
            case 7:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        Burc = "Yengeç";
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
                        Burc="Başak";
                    }
                } else {
                    isEror=true;
                }
                break;
            case 9:
                if (day >= 1 && day < 31) {
                    if (day < 23) {
                        Burc = "Başak";
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
                        Burc="Oğlak";
                    }
                } else {
                    isEror=true;
                }
                break;

        }

    }
}
