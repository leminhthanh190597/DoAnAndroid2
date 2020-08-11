package com.example.my.project51;


public class choncauhoi {
public static int b;
public static int c;
public static int d;
public static int e;
public static int f;

public choncauhoi(){
    int[] a= new int[3]; 
    // tạo dãy số liên tục từ 1 dến 5 
    for (int i=0; i<3 ; i++) 
    {
   	 a[i]=i+1; 
    }
    // xao tron xuoi 
    for (int i=0; i<3; i++)
    {
    for (int j=i+1;j<3;j++) 
    { 
    int temp=(int) (Math.random()*100); 
    if (temp%2==0) 
    { 
    int x=a[i]; 
    a[i]=a[j]; 
    a[j]=x; 
    } 
    } 
    }
    // xao tron nguoc 
    for (int i=2; i>=0 ; i--) 
    {
    for (int j=i-1;j>=0;j--) 
    { 
    int temp=(int) (Math.random()*100); 
    if (temp%2==0) 
    { 
    int x=a[i]; 
    a[i]=a[j]; 
    a[j]=x; 
    } 
    } 
    }
    // lấy ra 5 số của dãy sau khi bị xáo trộn
     choncauhoi.b=a[0]; 
     if (choncauhoi.b==1)
     {
    	 choncauhoi.c=2;
    	 choncauhoi.d=3;
    	 choncauhoi.e=4;
    	 choncauhoi.f=5;
     }
     else if(choncauhoi.b==2)
     {
    	 choncauhoi.c=4;
    	 choncauhoi.d=3;
    	 choncauhoi.e=1;
    	 choncauhoi.f=5;
     }
     else if (choncauhoi.b==3)
     {
    	 choncauhoi.c=2;
    	 choncauhoi.d=4;
    	 choncauhoi.e=1;
    	 choncauhoi.f=5;
     }
     else {
    	 choncauhoi.c=3;
    	 choncauhoi.d=5;
    	 choncauhoi.e=2;
    	 choncauhoi.f=1;
     }
    	 
     }
     
}

