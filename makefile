# For running on local machine, use test_local
test_local: MarkdownParse.class MarkdownParseTest.class
	java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest

MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java

MarkdownParseTest.class: MarkdownParseTest.java
	javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java MarkdownParse.java

# Run Lab 4 Tests
test_lab_report_4: MarkdownParse.class LabReport4Tests.class
	java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore LabReport4Tests

LabReport4Tests.class: LabReport4Tests.java
	javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar LabReport4Tests.java MarkdownParse.java

# For running on ieng6 machine, use test_remote
# test_remote: MarkdownParse.class MarkdownParseTest.class
# 	/software/CSE/oracle-java-17/jdk-17.0.1/bin/java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest

# MarkdownParse.class: MarkdownParse.java
# 	/software/CSE/oracle-java-17/jdk-17.0.1/bin/javac MarkdownParse.java

# MarkdownParseTest.class: MarkdownParseTest.java
# 	/software/CSE/oracle-java-17/jdk-17.0.1/bin/javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java MarkdownParse.java