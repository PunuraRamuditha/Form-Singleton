/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registration;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Skyynemo
 */
public class Connection {
    private static Connection jdbc;
    
    private Connection(){}
    
    public static Connection getInstance(){
        if (jdbc==null)
        {
          jdbc = new Connection();  
        }
    return jdbc;
    }
    
    private static java.sql.Connection getConnection() throws ClassNotFoundException,SQLException{
        String url = "jdbc:mysql://localhost:3306/registrations";
        String user = "root";
        String password = "";
        java.sql.Connection conn = null;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url,user,password);
        }
        catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    return conn;
    }
    
    public int CourseInsert(String Name,String Period,String Price) throws SQLException{
        java.sql.Connection c=null;
        PreparedStatement ps=null;
        String insert=null;
        int recordCounterCourse=0;
        try{
            c=this.getConnection();
            insert ="Insert into Course_details(Course_Name, Course_Period , Course_Price) values(?,?,?)";
            ps=c.prepareStatement(insert);
            ps.setString(1, Name);
            ps.setString(2, Period);
            ps.setString(3, Price);
            recordCounterCourse=ps.executeUpdate();
        }
        catch(Exception e){e.printStackTrace();}
        finally{
            if(ps!=null){
                ps.close();
            }
            if(c!=null){
                c.close();
            }
        }
    return recordCounterCourse;
    }
    
    public int StudentInsert(String Name,String Email,String Age,String Contact) throws SQLException{
        java.sql.Connection c=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        String insert=null;
        int recordCounterStudent=0;
        try{
            c=this.getConnection();
            insert = "Insert into Student_details(Student_Name , Student_Email, Student_Age, Student_Contact) values(?,?,?,?)";
            ps=c.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, Name);
            ps.setString(2, Email);
            ps.setString(3, Age);
            ps.setString(4, Contact);
            recordCounterStudent=ps.executeUpdate();
            rs = ps.getGeneratedKeys();
                if(rs.next()){
                    studentId = rs.getInt(1);
                }
        }
        catch(Exception e){e.printStackTrace();}
        finally{
            if(ps!=null){
                ps.close();
            }
            if(c!=null){
                c.close();
            }
        }
    return recordCounterStudent;
    }
    
    public int StudentCourseInsert(Integer StudentId, Integer CourseId) throws SQLException{
        java.sql.Connection c=null;
        PreparedStatement ps=null;
        String insert=null;
        int recordCounterStudentCourse=0;
        try{
            c=this.getConnection();
            insert ="Insert into Student_course (StudentID, CourseID) values(?,?)";
            ps=c.prepareStatement(insert);
            ps.setInt(1, StudentId);
            ps.setInt(2, CourseId);
            recordCounterStudentCourse=ps.executeUpdate();
        }
        catch(Exception e){e.printStackTrace();}
        finally{
            if(ps!=null){
                ps.close();
            }
            if(c!=null){
                c.close();
            }
        }
    return recordCounterStudentCourse;
    }
    
    public List getCourseName() {
        java.sql.Connection c=null;
        Statement stmt=null;
        ResultSet rs=null;
        String q=null;
        try {
            c=this.getConnection();
            stmt = c.createStatement();
            q = "Select * from Course_details";
            rs = stmt.executeQuery(q);
            while (rs.next()) {
                Course course = new Course();
                course.setCourseId(rs.getInt("CourseID"));
                course.setCourseName(rs.getString("Course_Name"));
                course.setCoursePeriod(rs.getInt("Course_Period"));
                course.setCoursePrice(rs.getInt("Course_Price"));
                courseList.add(course);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    return courseList;
    }
     
//varible Declaration
List<Course> courseList = new ArrayList<>();
int studentId = 0;
//end of variable declaration
}
