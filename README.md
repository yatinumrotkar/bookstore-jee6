JEE6 Bookstore sample application.

# Running

1. Run the H2 database server: `mvn -Ph2 exec:java`
2. Run with TomEE `mvn package tomee:run`
4. Navigate to <a href="http://localhost:8080/bookstore-jee6/">http://localhost:8080/bookstore-jee6/</a>

# IntelliJ Database browser

1. Driver `org.h2.Driver`
2. Database URL `jdbc:h2:tcp://localhost/bookstorejee6`
3. User Name `sa`
4. Password (empty)

EOF
