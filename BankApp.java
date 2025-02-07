import java.util.Scanner;
class BankApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name = null;
		String pass = null;
		String add = null;
		long ph = 0;
		double bal = 0.0;
		for(; ;)
		{
			System.out.println();
			System.out.println("1. Existing User");
			System.out.println("2. Create Account");
			System.out.println();
			System.out.print("Choose the option : ");
			int opt = sc.nextInt();
			if(opt == 1)
			{
				if(pass==null && name == null)
					{
						System.out.println();
						System.out.println("FIRST CREATE ACCOUNT THEN LOGIN.");
						System.out.println();
						continue;
					}
					for(int i = 3;i>=1;i--)
					{
						System.out.print("username : ");
						String name1 = sc.next();
						System.out.print("Password : ");
						String pass1 = sc.next();
						
						if(name1.equals(name) && pass1.equals(pass))
						{
							System.out.println();
							System.out.println("LOGIN SUCEESSFULL WELCOME");
							home:
							for( ; ; )
							{
								System.out.println();
								System.out.println("HOME PAGE");
								System.out.println();
								System.out.println("1. DEPOSIT");
								System.out.println("2. WITHDRAW");
								System.out.println("3. CHECK BALANCE");
								System.out.println("4. MINI STATEMENT");
								System.out.println("5. LOGOUT");
								System.out.println();
								System.out.print("Enter the option : ");
								int opt1 = sc.nextInt();
								switch(opt1)
								{
									case 1:
									{
										System.out.println();
										System.out.println("**********DEPOSIT**********");
										System.out.println();
										System.out.print("Enter the amount : ");
										double dep =  sc.nextDouble();
										bal += dep;
										System.out.println();
										System.out.println("Amount deposited successfully.");
										System.out.println();
										break;
									}
									case 2:
									{
										System.out.println("**********WITHDRAW**********");
										for(int j=3;j>=1;j--)
										{
											System.out.println();
											System.out.print("Enter the  pin : ");
											String pin = sc.next();
											if(pin.equals(pass))
											{
												System.out.println();
												System.out.print("Enter the amount : ");
												double wit = sc.nextDouble();
												if(bal>wit)
												{
													bal-= wit;
													System.out.println();
													System.out.println("Amount withdraw successfully.");
													System.out.println();
													continue home;
												}
												else
												{  
													System.out.println();
													System.out.println("Insufficiant balance.");
													System.out.println();
													continue home;
												}
											}
											else
											{
											    System.out.println();
												System.out.println("Your credential does not match.");
												System.out.println("You have "+(j-1)+" attempt left.");
												System.out.println();
											}
										}
										System.out.println("YOU HVE BEEN BLOCKED FOR 24 HOURS");
										System.exit(0);
										break;
									}
									case 3:
									{
										System.out.println("**********CHECK BALANCE**********");
										for(int k=3;k>=1;k--)
										{
											System.out.println();
											System.out.print("Enter the pin : ");
											String pin1 = sc.next();
											if(pin1.equals(pass))
											{
												System.out.println();
												System.out.println("Available Balance  : "+bal);
												System.out.println();
												continue home;
											}
											else
											{
												System.out.println();
												System.out.println("Your credential does not match.");
												System.out.println("You have "+(k-1)+" attempt left.");
												System.out.println();
											
											}
										}
										System.out.println("YOU HVE BEEN BLOCKED FOR 24 HOURS");
										System.exit(0);
										break;
									}

									case 4:
									{
										System.out.println();
										System.out.println("**********MINI STATEMENT**********");
										System.out.println();
										break;
									}
									case 5:
									{
										System.out.println();
										System.out.println("**********LOGOUT**********");
										System.out.println();
										break;
									}
									default:
									{
										System.out.println();
										System.out.println("Enter valid option");
										System.out.println();
									}
								}
							} 
						}
						else
						{ 
							System.out.println();
							System.out.println("Your credential does not match.");
							System.out.println("You have "+(i-1)+" attempt left.");
							System.out.println();
						}

						
					}
					System.out.println("YOU HVE BEEN BLOCKED FOR 24 HOURS");
					System.exit(0);

			}
			else if(opt == 2)
			{
				System.out.println();
				System.out.print("Enter the username : ");
				name = sc.next();
				System.out.print("Enter the password : ");
				pass = sc.next();
				System.out.print("Enter the phone number : ");
				ph = sc.nextLong();
				System.out.print("Enter the address : ");
				add = sc.nextLine();
				sc.nextLine();
				System.out.print("Enter the amount : ");
				bal = sc.nextDouble();
				System.out.println();
			}
			else
			{
				System.out.println();
				System.out.println("Enter valid option!");
				System.out.println();
			}
		}
	}
}
