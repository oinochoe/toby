package springbook.user.exception;

import com.mysql.jdbc.MysqlErrorNumbers;

import java.sql.SQLException;

// 예외 전환 기능을 가진 DAO 메소드
public class Exception_ex3 {
    /*
   public void add(User user) throws  DulplicateUserIdException, SQLException {
       try {
           // JDBC를 이용해 user 정보를 DB에 추가하는 코드 또는
           // 그런 기능을 가진 다른 SQLException을 던지는 메소드를 호출하는 코드
       }
       catch (SQLException e) {
           // ErrorCode가 MySQL의 "Duplicate Entry(1062)"이면 예외 전환
           if (e.getErrorCode() == MysqlErrorNumbers.ER_DUP_ENTRY) {
               throw DuplicateUserIdException();
           } else {
               throw e; // 그 외의 경우는 SQLException 그대로
           }
       }
   }
   */
}
