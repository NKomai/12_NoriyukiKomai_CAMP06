package com.company;

public class Coincase {
    public int t500;
    public int t100;
    public int t50;
    public int t10;
    public int t5;
    public int t1;

    public int AddCoins(int coin, int count) {
        int result = 0;
        switch (coin) {
            case 500:
                t500 += count;
                break;
            case 100:
                t100 += count;
                break;
            case 50:
                t50 += count;
                break;
            case 10:
                t10 += count;
                break;
            case 5:
                t5 += count;
                break;
            case 1:
                t1 += count;
                break;
            default:
                result = 1;
        }
        return result;
    }

    public int GetCount(int coin) {
        int result = 0;
        switch (coin) {
            case 500:
                result = t500;
            break;
            case 100:
                result = t100;
            break;
            case 50:
                result = t50;
            break;
            case 10:
                result = t10;
            break;
            case 5:
                result = t5;
            break;
            case 1:
                result = t1;
            break;
            default:
                result = 0;
        }
        return result;
    }

    public int GetAmount(){
        int amount = (500 * t500)+(100 * t100)+(50 * t50)+(10 * t10)+(5 * t5)+(1 * t1);
        return amount;
    }



}
