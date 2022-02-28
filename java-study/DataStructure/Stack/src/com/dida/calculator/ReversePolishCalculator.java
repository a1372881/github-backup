package com.dida.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author 23216
 * @version 1.0
 * @description: 逆波兰计算器
 * 输入一个后缀表达式，使用栈 计算其结果
 *
 * @date 2022/2/5 21:54
 */
public class ReversePolishCalculator {
    public static void main(String[] args) {
        //先定义逆波兰表达式
        //将逆波兰表达式用空格分开
        String suffxExpression = "4 5 * 8 - 60 + 8 2 / +";

        //将suffxExpression放进ArrayList中
        //将arrayList传递给一个方法，遍历ArrayList配合栈完成计算

        List<String> listString = getListString(suffxExpression);
        System.out.println(listString);
        int calculate = calculate(listString);
        System.out.println(calculate);

    }

    /**
     * 将中缀表达式字符串放入ArrayList中
     * @param s 需要转换的中缀表达式字符串
     * @return 转换好的list
     */
    public static List<String> toInfixExpressionList(String s){
        //定义一个list存放中缀表达式
        ArrayList<String> ls = new ArrayList<>();
        //辅助指针，用于遍历字符串
        int i = 0;
        //拼接多为数
        String str;
        //遍历到一个字符就放到c中
        char c;
        do {
            //如果c是一个非数字，需要加入到ls中
            if ((c = s.charAt(i)) < 48 || (c = s.charAt(i)) > 57){
                ls.add("" + c);
                i ++;//将i后移
            }else {
                str = "";
                while (i < s.length() && (c = s.charAt(i)) >= 48 && (c = s.charAt(i)) > 57){
                    str += c;
                    i++;
                }
                ls.add(str);
            }

        }while (i < s.length());
        return ls;




    }



    /**
     * 将逆波兰字符串放入arraylist中
     * @param suffxExpression 逆波兰字符串
     * @return 返回存放了逆波兰字符的arraylist
     */
    public static List<String> getListString(String suffxExpression){

        //将它分割
        String[] split = suffxExpression.split(" ");
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(split));
        return list;
    }

    /**
     * 完成堆逆波兰表达式的计算
     * @param ls  接收一个List<String> 里面存放了转换好的逆波兰字符
     *            完成思路
     *            1.从左到右扫描，将数字压入栈
     * @return 返回结果
     */
    public static int calculate(List<String> ls){

        //创建一个栈
        Stack<String> stack = new Stack<>();
        //遍历ls
        for (String item : ls) {
            //取出数据
            if (item.matches("\\d+")){
                stack.push(item);
            }else {
                //pop出两个数
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                int res = 0;
                if ("+".equals(item)){
                    res = num1 + num2;
                }else if ("-".equals(item)){
                    res = num1 - num2;
                }else if ("*".equals(item)){
                    res = num1 * num2;
                }else if ("/".equals(item)){
                    res = num1 / num2;
                }
                stack.push("" + res);
            }
        }
        return Integer.parseInt(stack.pop());
    }

}
