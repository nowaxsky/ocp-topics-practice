CALL SQLJ.install_jar (
'D:\Eclipse\Java-SE\tutorials\ocp-topics-practice\ch13-derby-stored-procedure.jar',
'ROOT.DerbyStoredProcedure',
0
);

CALL syscs_util.syscs_set_database_property (
'derby.database.classpath',
'ROOT.DerbyStoredProcedure'
);

CREATE procedure EMP_SALARY_COUNT(
IN salary REAL,
OUT num INTEGER)
LANGUAGE JAVA
PARAMETER STYLE JAVA
DYNAMIC RESULT SETS 0
READS SQL DATA
EXTERNAL NAME 'EmployeeStoredProcedure.countSalary';

CREATE procedure EMP_AGE_COUNT(
IN bithday DATE,
OUT num INTEGER)
LANGUAGE JAVA
PARAMETER STYLE JAVA
DYNAMIC RESULT SETS 0
READS SQL DATA
EXTERNAL NAME 'EmployeeStoredProcedure.countAge';
