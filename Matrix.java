package com.apisero;
import java.util.Scanner;
public class Matrix{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows,columns,matrix1[][],matrix2[][];
		System.out.println("Enter the number of rows:");
		rows=sc.nextInt();
		System.out.println("Enter the number of columns:");
		columns=sc.nextInt();
		System.out.println("Enter the elements for the 1st matrix:");
		matrix1=new int[rows][columns];
		//reading the elements from scanner
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				matrix1[i][j]=sc.nextInt(); 
			}
		}
		System.out.println("Enter the elements for the 2nd matrix:");
		matrix2=new int[rows][columns];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				matrix2[i][j]=sc.nextInt(); 
			}
		}
		//print the elements
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}

		int matrix3[][]=new int[rows][columns];
		System.out.println("Given options are :\n add sub multiply square");
		System.out.println("Enter the choice");
		String choice=sc.next();
		switch (choice) {
		case "add":
			System.out.println("Addition matrix is:");
			try {
				for(int i=0;i<rows;i++)
				{

					for(int j=0;j<columns;j++)
					{
						matrix3[i][j]=0;
						matrix3[i][j]+=matrix1[i][j]+matrix2[i][j]; 
						System.out.print(matrix3[i][j]+" ");
					}
					System.out.println();
				}

				break;
			} 
			catch (ArrayIndexOutOfBoundsException aoe) {
				aoe.printStackTrace();
			}

		case "sub":
			System.out.println("Subtraction matrix is:");
			try {
				for(int i=0;i<rows;i++)
				{
					for(int j=0;j<columns;j++)
					{
						matrix3[i][j]=0;
						matrix3[i][j]+=matrix1[i][j]-matrix2[i][j]; 
						System.out.print(matrix3[i][j]+" ");
					}
					System.out.println();
				}

				break;
			} catch (ArrayIndexOutOfBoundsException aoe) {
				aoe.printStackTrace();
			}

		case "multiply":
			System.out.println("Multplication matrix is:");
			try {
				for(int i=0;i<rows;i++)
				{
					for(int j=0;j<columns;j++)
					{
						matrix3[i][j]=0;
						for(int k=0;k<columns;k++)
						{
							matrix3[i][j]+= matrix1[i][k]*matrix2[k][j];
						}
						System.out.print(matrix3[i][j]+" ");
					}
					System.out.println();
				}

				break;
			} catch (ArrayIndexOutOfBoundsException aoe) {
				aoe.printStackTrace();
			}

		case "square":
			System.out.println("Square of matrix is:");
			try {
				for(int i=0;i<rows;i++)
				{
					for(int j=0;j<columns;j++)
					{
						matrix3[i][j]=0;
						matrix3[i][j]+= matrix1[i][j]*matrix1[i][j];
						System.out.print(matrix3[i][j]+" ");
					}
					System.out.println();
				}
				break;
			} catch (ArrayIndexOutOfBoundsException aoe) {
				aoe.printStackTrace();
			}
		default:System.out.println("Enter proper choice");
		break;
		}
	}

}
