package com.example.LLD.Splitwise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DebtSimplificationAlgorithm {

    //using this lago we will return minimum number of transaction required to pay the debt

    public static void main(String args[]) {
        Map<Integer, Integer> balanceUserMap = new HashMap<>();
//        int trans[][] = new int[5][3];
//        for(int i=0; i< trans.length;i++) {
//            int from = trans[i][0];
//            int to = trans[i][1];
//            int amount = trans[i][2];
//            balanceUserMap.put(from, balanceUserMap.getOrDefault(from, 0)-amount);
//            balanceUserMap.put(to, balanceUserMap.getOrDefault(to, 0)+amount);
//        }
        List<Integer> balances = new ArrayList<>();
        for(int value : balanceUserMap.values()) {
            if(value != 0) {
                balances.add(value);
            }
        }
        balances.add(70);
        balances.add(-200);
        balances.add(300);
        balances.add(-40);
        balances.add(-30);
        balances.add(-100);
        int min = dfs(balances, 0);
        System.out.println(min);

    }

    public static int dfs(List<Integer> balance, int currInd) {
        if(currInd >= balance.size()) {
            return 0;
        }
        if(balance.get(currInd) == 0) {
            return dfs(balance, currInd+1);
        }
        int currVal = balance.get(currInd);
        int minValue = Integer.MAX_VALUE;
        for(int nextInd = currInd+1; nextInd < balance.size(); nextInd++) {
            int nextVal = balance.get(nextInd);

            if(currVal * nextVal < 0) {
                balance.set(nextInd, currVal+nextVal);
                minValue = Math.min(minValue, 1+dfs(balance, currInd+1));
                balance.set(nextInd, nextVal);
                if(currVal + nextVal == 0) {
                    break;
                }

                System.out.println(currVal + " " + nextVal + " " + minValue);
            }
        }
        return minValue;
    }


}
