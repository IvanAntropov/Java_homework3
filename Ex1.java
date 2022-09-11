//Написать программу, показывающую последовательность действий для игры “Ханойская башня”

import java.util.Scanner;

public class Ex1 {

    static void SolveSequence(int height,int startTower, int middle, int endTower){
        if(height==1){
            System.out.println(height + " disk from " + startTower + " to " + endTower);
            return;
        }
        SolveSequence(height-1,startTower,endTower,middle);
        System.out.println(height + " disk from " + startTower + " to " + endTower);
        SolveSequence(height-1,middle,startTower,endTower);
    }

    static int InputNumber(String text1, String text2){
        boolean check = true;
        Scanner in = new Scanner(System.in);
        int n = 0;
        while(check){
            System.out.printf(text1);
            if(in.hasNextInt()){
                n = in.nextInt();
                if(n <= 2){
                    System.out.println(text2);
                }else{
                    check = false;
                }
            } else {
                System.out.println(text2);
                in.next();
            }
        }
        return n;
    }


    public static void main(String[] args){

//        int numberOfTowers = InputNumber("Введите количество башен: ", "======Error======\n Минимальное кол-во 3!");
        int height = InputNumber("Введите высоту башни: ", "======Error======\n Число должно быть положительным и целым!");

        SolveSequence(height,1,2,3);


    }
}
