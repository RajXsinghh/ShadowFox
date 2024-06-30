//package com.project.Libraryx;
//
//import java.sql.*;
//import java.util.*;
//
//public class SqliteLibrary {
//
//	private Connection connect() {
//		 String url = "jdbc:sqlite:library.db";
//		 Connection conn = null ;
//		 
//		 try {
//			conn=DriverManager.getConnection(url);
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		} 
//	   return conn;
//	}
//	
//	//create
//	public void create() {
//		
//		String userTable ="CREATE TABLE IF NOT EXISTS users (\n"
//		          + "id INTEGER PRIMARY KEY,\n"
//		          + "username TEXT NOT NULL,\n"
//		          + "password TEXT NOT NULL \n"
//		          + ");" ;
//		
//		String bookTable ="CREATE TABLE IF NOT EXISTS books (\n"
//				  + "id INTEGER PRIMARY KEY, \n"
//				  + "title TEXT NOT NULL,\n"
//				  + "author TEXT NOT NULL, \n"
//				  + "recommended_by INTEGER, \n"
//				  + "FOREIGN KEY (recommended_by) REFERENCES users(id)\n"
//				  + ");" ;
//	try(Connection conn =this.connect();
//		Statement st =conn.createStatement())  
//	{	 
//			 st.execute(userTable);
//	         st.execute(bookTable); 
//	     System.out.println("Table created successfully !");         
//	} 
//	  catch(SQLException e) {
//		  System.out.println(e.getMessage());
//	  }
//	
//	}
//	
//	//Insert user
//	public void insertU(String username, String password) {
//		String sql ="INSERT INTO users(username,password) VALUES(?,?)";
//		
//		try(Connection conn=this.connect();
//		PreparedStatement ps =conn.prepareStatement(sql)){
//		ps.setString(1, username);
//		ps.setString(2, password);
//		ps.executeUpdate();
//		System.out.println("User data inserted !");
//		}
//		catch(SQLException e) {
//			System.out.println(e.getMessage());
//		}
//	
//	}
//	// insert book
//	public void insertB(String title, String author, int recommendedBy) {
//		String sql ="INSERT INTO books(title,author,recommended_by) VALUES (?,?,?)";
//		
//		try(Connection conn =this.connect();
//		PreparedStatement ps =conn.prepareStatement(sql)){
//		ps.setString(1, title);
//		ps.setString(2, author);
//		ps.setInt(3, recommendedBy);
//		ps.executeUpdate();
//		System.out.println("Book data inserted !");
//		}
//		
//		catch(SQLException e){
//			System.out.println(e.getMessage());
//		}
//		
//	}
//	
//	//select all users
//	public List<String> selectAllUsers() {
//		String sql ="SELECT id, username FROM users";
//		List<String> users =new ArrayList<>();
//		
//	try(	Connection conn =this.connect();
//		Statement st =conn.createStatement();
//		ResultSet rs =st.executeQuery(sql)){
//		
//		while(rs.next()) {
//			users.add(rs.getInt("id") + "\t" + rs.getString("username"));
//		}
//	} catch(SQLException e) {
//		 System.out.println(e.getMessage());
//	}
//		
//		return users ;		
//	}
//	
//	// select all books
//	
//	public List<String> selectAllBooks() {
//	   String sql="SELECT id, title, author, recommended_by FROM books";
//	   List<String> books=new ArrayList<>();
//	   try(Connection conn =this.connect();
//	       Statement st = conn.createStatement();
//		   ResultSet rs=st.executeQuery(sql)){
//		   
//		   while(rs.next()) {
//			 books.add(rs.getInt("id")+"\t"+rs.getString("title")+rs.getString("author")+"\t"+rs.getInt("recommended_by"));
//			}
//		   
//	   }catch(SQLException e) {
//		   System.out.println(e.getMessage());
//	   }
//	    return books;
//	}
//
//	//Update user information
//	public void updateUser(int id,String username,String password ) {
//		String sql ="UPDATE users SET username = ?, password =? WHERE id = ?";
//		
//	try(Connection con =this.connect();
//		PreparedStatement ps =con.prepareStatement(sql)){
//		ps.setString(1, username);
//		ps.setString(2, password);
//		ps.executeUpdate();
//	}
//	catch(SQLException e) {
//		System.out.println(e.getMessage());
//	}
//		
//	}
//	
//	//Update book information
//	public void updateBook(int id, String title, String author, int recommendedBy) {
//		String sql="UPDATE books SET title=?, author=?, recommended_by=? WHERE id=?";
//	 try(Connection con=this.connect();
//		 PreparedStatement ps= con.prepareStatement(sql)){
//		 ps.setString(1, title);
//		 ps.setString(2, author);
//		 ps.setInt(3, recommendedBy);
//		 ps.setInt(4, id);
//		 ps.executeUpdate();
//	  }
//	 catch(SQLException e) {
//		 System.out.println(e.getMessage());
//	 }
//   }
//	
//	// Delete a user
//	public void deleteUser(int id) {
//		String sql ="DELETE FROM users WHERE id=?";
//		
//		try(Connection con=this.connect(); PreparedStatement ps=con.prepareStatement(sql)){
//			ps.setInt(1, id);
//			ps.executeUpdate();
//		}
//		catch(SQLException e) {
//			System.out.println(e.getMessage());
//		}
//     }
//	
//	//Delete a book
//	public void deleteBook(int id) {
//	String sql ="DELETE FROM books WHERE id=?";
//		
//		try(Connection con=this.connect(); PreparedStatement ps=con.prepareStatement(sql)){
//			ps.setInt(1, id);
//			ps.executeUpdate();
//		}
//		catch(SQLException e) {
//			System.out.println(e.getMessage());
//		}
//     }
//	
//	
//	
//	
//	
//	
//	
//  public static void main (String []args) {
//	  
//	  SqliteLibrary x =new SqliteLibrary ();
//	  x.create();
//	  x.insertU("RAJJO", "pra123");
//	  x.insertB("Science ", "Loda", 66);
//	
//	  //to display book
//	  System.out.println("Users:");
//	  for (String user : x.selectAllUsers() ) {
//		  System.out.println(user);
//	  }
//	   //to display
//	  System.out.println("\nBooks:");
//	  for (String book : x.selectAllBooks() ) {
//		  System.out.println(book);
//	  }
//	  
//	  //update a user
//	   
//	  
//	  //Delete user
////	  x.deleteUser(1);
////	  x.deleteUser(2);
////	  x.deleteUser(3);
////	  x.deleteUser(4);
////	  x.deleteUser(5);
////	  x.deleteUser(6);
////	  x.deleteUser(7);
////	  x.deleteUser(10);
////	  x.deleteBook(1);
////	  x.deleteBook(2);
////	  x.deleteBook(3);
////	  x.deleteBook(4);
////	  x.deleteBook(5);
////	  x.deleteBook(6);
////	  x.deleteBook(7);
////	  x.deleteBook(10);
//	  
//	  
//	}
//	
//}
