package prctc;

public class CRUD_util{
    private String dbuser;
    private String dbhost;
    private String dbpass;
    private String dbname;
    private dbType dbType1=dbType.MONGO;


    public CRUD_util(String dbuser, String dbhost, String dbpass, String dbname, dbType dbType1) {
        this.dbuser = dbuser;
        this.dbhost = dbhost;
        this.dbpass = dbpass;
        this.dbname = dbname;
        this.dbType1 = dbType1;
    }







}


