/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adtfractionapp;

/**
 *
 * @author Admin
 */
public class ADTFraction { 
    private int numerator;  //numerator 
    private int denomenator;  //denomenator 
    //--------------------------------------------------- 
    public ADTFraction() {//default constructor 
        numerator = 0; 
        denomenator = 1; 
    } 
    //--------------------------------------------------- 
    public ADTFraction(int a, int b) {//parameter constructor 
        if(b!=0){
         numerator = a;
         denomenator = b;
        }else System.out.println("d cannot be zero");
    } 
    //--------------------------------------------------- 
    public void set(int a, int b) {//set numerator and denomenator 
         if(b!=0){
         numerator = a;
         denomenator = b;
        }else System.out.println("d cannot be zero");
    } 
    //--------------------------------------------------- 
    public ADTFraction plus(ADTFraction f) {//add two fractions 
        ADTFraction r = new ADTFraction((numerator * f.denomenator) +(f.numerator * denomenator), (denomenator * f.denomenator));                   
        return r;   
    } 
    //--------------------------------------------------- 
    public ADTFraction sub(ADTFraction f) {//sub two fractions 
         ADTFraction r = new ADTFraction((numerator * f.denomenator) -(f.numerator * denomenator), (denomenator * f.denomenator));                   
        return r;   
    }  
    //--------------------------------------------------- 
    public ADTFraction times(int a) {//multiply fraction by a number 
        ADTFraction r = new ADTFraction((numerator*a),denomenator);         
        return r; 
    } 
    //--------------------------------------------------- 
    public ADTFraction times(ADTFraction f) {//multiply two fractions 
        ADTFraction r = new ADTFraction((numerator * f.numerator),(denomenator * f.denomenator));                   
        return r; 
    } 
    //--------------------------------------------------- 
    public ADTFraction reciprocal() {//reciprocal of a fraction
        ADTFraction r = new ADTFraction(denomenator,numerator);          
        return r; 
    } 
    //--------------------------------------------------- 
    public float value() {//numerical value of a fraction 
        float d = ((float)numerator/(float)denomenator);         
        return d; 
    } 
    //--------------------------------------------------- 
    public void display() {//display the fraction in the format n/d 
        System.out.println("n/d= "+ numerator+ "/" + denomenator); 
    }
    //---------------------other methods------------------------------ 
    // return greatest common divisor of a and b 
    public static int gcd(int a, int b) {
       int rem;         
       while (b > 0) {             
           rem = a % b;             
           a = b;             
           b = rem;         
       }         return a;
    } 
     public static int lcm(int a, int b){
       return ((a*b)/gcd(a,b));
     }
 }