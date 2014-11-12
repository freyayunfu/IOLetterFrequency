/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioletterfrequency;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class calculates the frequency of each letter.
 *
 * @author FU, Yun
 * @version 1.0
 * @since 25/10/2014
 */
public class IOLetterFrequency {

    /**
     * calculates the frequency of each letter
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        System.out.println("Enter the filename:");
        Scanner textName = new Scanner(System.in);
        String FileName = textName.nextLine();

        Scanner scanFile = new Scanner(new BufferedReader(new FileReader(FileName)));
        String ScanFile = "";
        while (scanFile.hasNext()) {
            ScanFile = ScanFile + scanFile.next();
        }
        String ScanFileLowerCase = ScanFile.toLowerCase();

        ArrayList letter = new ArrayList();
        int i = 0;
        while (ScanFileLowerCase.length() != i) {
            if (ScanFileLowerCase.charAt(i) == 'a' | ScanFileLowerCase.charAt(i) == 'b'
                    | ScanFileLowerCase.charAt(i) == 'c' | ScanFileLowerCase.charAt(i) == 'd'
                    | ScanFileLowerCase.charAt(i) == 'e' | ScanFileLowerCase.charAt(i) == 'f'
                    | ScanFileLowerCase.charAt(i) == 'g' | ScanFileLowerCase.charAt(i) == 'a'
                    | ScanFileLowerCase.charAt(i) == 'a' | ScanFileLowerCase.charAt(i) == 'h'
                    | ScanFileLowerCase.charAt(i) == 'i' | ScanFileLowerCase.charAt(i) == 'j'
                    | ScanFileLowerCase.charAt(i) == 'k' | ScanFileLowerCase.charAt(i) == 'l'
                    | ScanFileLowerCase.charAt(i) == 'm' | ScanFileLowerCase.charAt(i) == 'n'
                    | ScanFileLowerCase.charAt(i) == 'o' | ScanFileLowerCase.charAt(i) == 'p'
                    | ScanFileLowerCase.charAt(i) == 'q' | ScanFileLowerCase.charAt(i) == 'r'
                    | ScanFileLowerCase.charAt(i) == 's' | ScanFileLowerCase.charAt(i) == 't'
                    | ScanFileLowerCase.charAt(i) == 'u' | ScanFileLowerCase.charAt(i) == 'v'
                    | ScanFileLowerCase.charAt(i) == 'w' | ScanFileLowerCase.charAt(i) == 'x'
                    | ScanFileLowerCase.charAt(i) == 'y' | ScanFileLowerCase.charAt(i) == 'z') {

                letter.add(ScanFileLowerCase.charAt(i));

            }
            i++;
        }

        double A = 0;
        double B = 0;
        double C = 0;
        double D = 0;
        double E = 0;
        double F = 0;
        double G = 0;
        double H = 0;
        double I = 0;
        double J = 0;
        double K = 0;
        double L = 0;
        double M = 0;
        double N = 0;
        double O = 0;
        double P = 0;
        double Q = 0;
        double R = 0;
        double S = 0;
        double T = 0;
        double U = 0;
        double V = 0;
        double W = 0;
        double X = 0;
        double Y = 0;
        double Z = 0;

        for (int n = 0; n < letter.size(); n++) {
            Character Letter = (char) letter.get(n);

            switch (Letter) {
                case 'a':
                    A++;
                    continue;
                case 'b':
                    B++;
                    continue;
                case 'c':
                    C++;
                    continue;
                case 'd':
                    D++;
                    continue;
                case 'e':
                    E++;
                    continue;
                case 'f':
                    F++;
                    continue;
                case 'g':
                    G++;
                    continue;
                case 'h':
                    H++;
                    continue;
                case 'i':
                    I--;
                    continue;
                case 'j':
                    J--;
                    continue;
                case 'k':
                    K++;
                    continue;
                case 'l':
                    L++;
                    continue;
                case 'm':
                    M++;
                    continue;
                case 'n':
                    N++;
                    continue;
                case 'o':
                    O++;
                    continue;
                case 'p':
                    P++;
                    continue;
                case 'q':
                    Q++;
                    continue;
                case 'r':
                    R++;
                    continue;
                case 's':
                    S++;
                    continue;
                case 't':
                    T++;
                    continue;
                case 'u':
                    U++;
                    continue;
                case 'v':
                    V++;
                    continue;
                case 'w':
                    W++;
                    continue;
                case 'x':
                    X++;
                    continue;
                case 'y':
                    Y++;
                    continue;
                case 'z':
                    Z++;
                    continue;

            }
        }
        System.out.printf("%30s%30s%30s\n", "LETTER", "Times","Frequency");
        System.out.printf("%30s%30.0f%30.2f\n", "A", A, A / letter.size());
        System.out.printf("%30s%30.0f%30.2f\n", "B", B, B / letter.size());
        System.out.printf("%30s%30.0f%30.2f\n", "C", C, C / letter.size());
        System.out.printf("%30s%30.0f%30.2f\n", "D", D, D / letter.size());
        System.out.printf("%30s%30.0f%30.2f\n", "E", E, E / letter.size());
        System.out.printf("%30s%30.0f%30.2f\n", "F", F, F / letter.size());
        System.out.printf("%30s%30.0f%30.2f\n", "G", G, G / letter.size());
        System.out.printf("%30s%30.0f%30.2f\n", "H", H, H / letter.size());
        System.out.printf("%30s%30.0f%30.2f\n", "I", I, I / letter.size());
        System.out.printf("%30s%30.0f%30.2f\n", "J", J, J / letter.size());
        System.out.printf("%30s%30.0f%30.2f\n", "K", K, K / letter.size());
        System.out.printf("%30s%30.0f%30.2f\n", "L", L, L / letter.size());
        System.out.printf("%30s%30.0f%30.2f\n", "M", M, M / letter.size());
        System.out.printf("%30s%30.0f%30.2f\n", "N", N, N / letter.size());
        System.out.printf("%30s%30.0f%30.2f\n", "O", O, O / letter.size());
        System.out.printf("%30s%30.0f%30.2f\n", "P", P, P / letter.size());
        System.out.printf("%30s%30.0f%30.2f\n", "Q", Q, Q / letter.size());
        System.out.printf("%30s%30.0f%30.2f\n", "R", R, R / letter.size());
        System.out.printf("%30s%30.0f%30.2f\n", "S", S, S / letter.size());
        System.out.printf("%30s%30.0f%30.2f\n", "T", T, T / letter.size());
        System.out.printf("%30s%30.0f%30.2f\n", "U", U, U / letter.size());
        System.out.printf("%30s%30.0f%30.2f\n", "V", V, V / letter.size());
        System.out.printf("%30s%30.0f%30.2f\n", "W", W, W / letter.size());
        System.out.printf("%30s%30.0f%30.2f\n", "X", X, X / letter.size());
       System.out.printf("%30s%30.0f%30.2f\n", "Y", Y, Y / letter.size());
        System.out.printf("%30s%30.0f%30.2f\n", "Z", Z, Z / letter.size());
        System.out.println("The total number of all letters is "+(int)(A+B+C+D+E+F+G+H+I+J+K+L+M+N+O+P+Q+R+S+T+U+V+W+X+Y+Z));

    }
}
