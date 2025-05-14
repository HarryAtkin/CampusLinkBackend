<h1>CampusLink<h1/><br/>
Mohammad Isa<br/>
Harry Atkinson<br/>
Ibrahim Khalifa<br/>
Amina Haq Nawaz<br/>
Minh Duc Dang<br/>
Aadil Hasan<br/>
Fizan Hussain<br/>
<h2>Table of Contents<h2/>
<ol>
<li>Introduction </li>
<li>Development
<ol>
<li>Requirement Analysis</li>
<li>Design specifications<ol>
<li>Backend design</li>
<li>User interface</li></ol></li>
<li>Implementation</li>
<li>Backend</li>
<li>Frontend</li>
<li>Accessibility</li>
<li>Security</li>
<li>Evaluation</li>
<li>PLESI</li>
</ol></li>
<li>Project Management 
<ol>
<li>Team Roles and Skills</li>
<li>Planning</li> </ol> </li>
<li>Conclusion</li>
<li>References</li>
<li>Appendix
  <ol>
<li>Team meeting – Appendix A</li>
<li>Updated Database ERD – Appendix B</li>
<li>Encountered issues – Appendix C</li>
<li>Constraints – Appendix D</li>
<li>Testing – Appendix E</li>
<li>Class diagrams – Appendix F</li>
<li>Development– Appendix G<ol>
<li>Sprint 1</li>
<li>Sprint 2</li>
<li>Sprint 3</li></ol></li>
<li>Scenario diagram – Appendix H</li>
<li>Activity diagram – Appendix I</li>
<li>GitHub – Appendix J</li>
<li>Trello – Appendix K</li>
<li>Team evaluation – Appendix L</li>
<li>Screenshots of final product – Appendix M</li>
<li>Screen design – Appendix N</li>
<li>designs</li>
<li>Key features/Moscow – Appendix O</li>
<li>Design feedback – Appendix P</li> </ol> </li>
<li>Code</li>
</ol>
<h2>1 Introduction</h2>
CampusLink is a multipurpose web application which aims to bridge the gap between student and teacher communication, by removing the middleman making it direct between students and teacher. As there is a “deficit of meaningful student voice” (Szafranski, M.S. 2024) within higher education, it is our goal to bridge this gap and try and give a platform that allows for meaningful conversations.
CampusLink creates chatrooms per module enabling open discussion between students and teachers regarding the module, it also contains students and teacher’s timetables.
Our project fulfils these requirements by creating chatrooms based on modules and allowing students to communicate in them. It also allows students to view their timetables and has a Todo list. The project also has a login page to prevent anyone from getting access to the data.
<h2>2 Development</h2>
<h3>2.1 Requirement Analysis</h3>
Research into our competitors gave us an overview of their strengths and weaknesses. This is advantageous as we can create our project around their weaknesses. ClassDojo’s (ClassDojo, Inc. 2011) main weakness is they are limited to primary school children and promote teacher-parent communication. Although, similar our target audience is university students. Unitu (Unitu. 2024) is promoted to university students, but its weakness is preventing direct communication between students and teachers by implementing a middleman. These examples present a gap for easy direct communication between teachers and students. Furthermore, the addition of having students’ timetables in the same place means that they are unlikely to forget about the chatroom functionality compared to a system like Unitu where it’s not directly linked to the site that holds user’s timetables.
Our key features for this project are listed below:
  <ul>
    <li>Login/register page</li>
    <li>Student/teacher dashboard</li>
    <li>Student/teacher chatroom</li>
    <li>Student attendance tracking</li>
    <li>Student/teacher timetable</li>
  </ul>
These are the core features of our program and make up the minimum viable product that aligns with our project aims.
<h3>2.2 Design specifications</h3>
<h4>2.2.1 Backend design</h4>
While designing the backend we created several UMLs to aid us. The first were class diagrams see Appendix F for the class diagrams. We made a scenario diagram that shows how each component interacts with one another and the operations performed when a user uses various features see Appendix H. Finally, we made two activity diagrams that show the flow of program see Appendix I.
To design the database, we created an Entity Relationship Diagram to map out any relationships and tables for the database see Appendix B. It follows normalization rules to 3rd form to ensure data integrity and prevent redundancy. We used Lucid charts (Lucid Software Inc. 2025) to create the ERD.
<h4>2.2.2 User interface</h4>
The screen designs are slightly different from the previous designs for these reasons and the new screen designs see Appendix N.
When designing the front-end we needed to consider a few things: accessibility constraints, program flow, and users technology capabilities. The first of these is covered in section 2.4. The program was important as we have different roles ultimately, we decided to have the teacher and the student dashboard be the same. This makes the project less complex and means that the users can easily understand the application. Since we are creating a web application to be used in an educational environment it’s important that we consider different technological knowledge ranges. We did this by making the design simple with static navigation that is clearly labeled. This should allow users to easily navigate the site.
<h3>2.3 Implementation</h3>
Our goal was to create a multipurpose web application that stores students’ timetables and can bridge the gap between student and teacher communication by containing university module-based chats. The web application needs to be easy to use and responsive so students and teachers alike can understand how to use it.
We coded our project in IntelliJ (JetBrains.  2025) integrated development environment (IDE), this increased productivity by having inbuilt debugging, compiler, code completion for repetitive tasks, and automated code formatting to make it easier to read and understand.</br></br>
We’ve developed CampusLink using the Scrum Agile methodology. This allowed us to streamline production by breaking down the webapp into smaller chunks and giving a set time for completion. See Appendix G for notes on each sprint. Communication is a massive part of agile scrum as you need to be flexible to change for example, we had to rapidly adjust our plans from developing the frontend in REACT (Meta. 2013) to a lightweight tech stack. This happened because of communications in our meetings and our WhatsApp group. Flexibility is a big benefit of agile scrum over other methodology like the waterfall method, after each sprint you review and go back to the planning stage. Whereas, in waterfall you follow a linear path from requirements to design and then to completion of the project, preventing response to change as you typically don’t return to the design phase in development. In agile scrum you have a minimum viable product that serves just enough functionality to meet the needs of our project, ours is having the students’ attendance tracking, chatroom and timetable pages working. We also need to have the chatrooms and timetable work for the teachers.
<h4>2.3.1 Backend</h4>
We used Springboot (VMware Tanzu. 2005-2025) to create a Restful Api in java. This functions as our backend sending data to and from the front end. We chose Springboot since it’s an industry standard meaning it has industry and community support. This is one of the main reasons we chose it over a technology such as PHP, as PHP is becoming outdated and can be restrictive, Springboot is highly customisable since it’s being dependency based. Our use of a Restful API has enabled effective communication between our frontend and backend allowing us to securely store users’ data and achieve functionality for example the chatroom we used the API to send data in the form of user messages back and forth between clients. However, the main downside of using Spring boot was the learning curve, this resulted in the development of CampusLink taking longer, this issue was eased by the large community support and the documentation for the framework. 
</br></br>
We chose Postgres (The PostgreSQL Global Development Group. 1996-2025) to create our database for its scalability, ACID compliance, and its SQL standards. The database is handled by the backend using the Spring boot Data JPA (VMware Tanzu. 2005-2025) dependency. This allowed the backend to create the tables and attributes for the database using Java classes, while handling relationship constraints see Appendix B; by using Java persistence query language, we can communicate with the database similarly to SQL. 
The main downside of Postgres was sharing copies of the database. Since the database was stored locally, sharing it during development was tricky; this won’t be an issue after release as the users would connect to the database remotely. We created an SQL script that would populate the database with test data and rely on the backend to create the tables and relationship constraints for the database.
<h4>2.3.2 Frontend</h4>
We used HTML, JavaScript, and CSS to create the frontend, ensuring it is lightweight and has built in functionality allowing seamless backend integration.  We used JavaScript’s built in fetch Api to integrate the frontend and the backend by creating http CRUD requests. We used http responses to communicate from the backend to the frontend for example when logging in, the frontend sends a post request and if the password is correct the backend returns a response 202 ACCEPTED granting the user access, if the password is incorrect the backend returns a 401 UNAUTHORISED response preventing the access. We are using a simple http server that’s created in java (Atkinson, H. A. 2024) allowing us to run our frontend by opening a local port, handling GET requests and returning a HTML file. The main downside of using this lightweight web stack, opposed to a framework like REACT is the repetition of code, for example the navbar code is repeated in every HTML file. But we decided to use this web stack as the team is familiar with it.
<h3>2.4 Accessibility</h3>
Accessibility guidelines posed a constraint on how we created and designed the pages. One accessibility constraint was allowing any text to be resized up to 200%, we achieved this by using REM in our CSS instead of PX allowing text to be resized based on the users defined browser text size this adheres to section 1.4.4 of WCAG 2 (W3C. 2024). We made it screen reader friendly, any text adheres by default however, any photos we added alt text to the tag in html which describes what the image is, for screen readers so it follows WCAG 2 section 1.1.1.
<h3>2.5 Security</h3>
For security the backend has Cross origin resource sharing. This defines what URLs can access data from the backend acting as a security feature. We stated that only our frontend URLs can access the backend. Before the user can access the backend, they need to be authenticated, this can only be achieved by the user logging in first. The database is also SSL encrypted securing the data from unauthorised access.
There is constraint-based security, for example students cannot edit timetables or create accounts, this can only be done by the admin. The admins cannot delete or create chatrooms. There are a few reasons for this, an example is to prevent the hiding of malpractice between student and teacher communication more on this in Section 2.7.
<h3>2.6 Evaluation</h3>
We achieved most of our must haves as can be seen in Appendix O this means that we completed most of our key features and a couple extra features like accessibility. During the development at the end of each sprint we would review it to make sure that all the work was completed and that it functioned correctly, we did this by at the start of each sprint coming up with test cases based on the functionality we wanted to achieve and then at the end of the sprint tested the program against them this can be seen in Appendix E. The program passed all the test cases that we tested against it, meaning it functions as it’s designed to.
We successfully created a visually appealing and responsive frontend that’s similar to the design plans and achieves the accessibility aims as highlighted in section 2.4, these can be seen in Appendix M. To achieve this, we had to overcome several constraints which are described in Appendix D and, multiple code and logic-based issues during development, see Appendix C for a list of these and how we resolved them. Furthermore, we asked for feedback on our user interface designs at the start of development these can be seen in Appendix P. We were responsive to this feedback making some changes like making the navigation bar have words on each page, opposed to just having icons, this makes it easier to navigate and understand. There are some suggested features that we have not added but may be added in the future, for example making the attendance tracker have different colours to make it more readable. This would fall under the customisation category which was described as a could have in our Moscow evaluation.
<h3>2.7 PLESI</h3>
For social we won’t discriminate based on political alignments. It’s the responsibility of the school’s administrators to regulate their chatrooms we will not discriminate against any student or teacher based on their political alignments or any other views that are being voiced in the chatroom. As it would be unethical, and it will break the trust we aim to create with CampusLink.</br></br>
To ensure the data collection is ethical we will be transparent with the user about what information we are collecting about them. This ensures trust, we’ll only be storing and using data for functional purposes, for example students name for chatroom messages. This isn’t only an ethical requirement but a legal one under the UK Data Protection Act 2018 (UK Government. 2018) requires fair and transparent data collection. The admins don’t have the ability to delete chatrooms, the reason for this is mentioned in section 2.5. We will keep all chatrooms for the maximum allowed time as described by the UK Data Protection Act 2018 and the only time we’ll share data is in case of law-breaking student-teacher communication malpractice.</br></br>
To maintain professionalism, we’ll ensure any data will be securely backed up in case of an emergency or data loss. The project stores sensitive data so we’ve added security features to protect data. See section 2.5. Threats for applications like ours are ever evolving, meaning to ensure security we must be constantly adapting, this is why in appendix O security is listed as not complete.
<h2>3 Project Management</h2>
During development we used GitHub (GitHub, Inc. 2025) to help us work as a team, see Appendix J for the GitHub repositories. It enabled us to store our code, allowing the entire team to access it remotely and it allowed us to protect the code by utilising branches to prevent us from overwriting each other’s code, it also has version control letting us be flexible to change and errors utilising agile scrum’s benefits. GitHub is preferable over other technologies for sharing code like OneDrive as it offers ways to protect the code. 
<h3>3.1 Team Roles and Skills</h3>
Each member of the team brought different skill sets and experience. The success of project is down to allocating roles based on skill sets and experience see Appendix L. Each member of the team has gained new skills and experience, in both technical and soft skills like communicating and working efficiently together. </br></br>
As mentioned earlier, communication is important and it’s imperative that the team knows what’s going on with development and the team in general. For this reason, we kept notes of meetings in Appendix A, allowing the team to review and understand what’s happening and where we are in development. We also used WhatsApp for communication, this allowed us to discuss any issues or changes remotely while we were developing at home. This was very important as we could be responsive to any issues regarding the team at any time without having to be face-to-face.
<h3>3.2 Planning</h3>
We used Trello to plan and track our development as seen in Appendix K. This was important as planning each sprint allowed us to locate which core functionality requires the most work and where to focus our efforts due to limitations in time. We created several test plans based on each sprint, we’ve had the testers black box test the project according to these plans and log the output against the expected output and can be seen in Appendix E.
<h2>4 Conclusion</h2>
To conclude, the project went well. As a team we managed to create a webapp that allows students to view their timetables and module chats enabling communication between students and teachers. There are core features that we were unable to complete due to various reasons see comments in Appendix O. Looking back at the start of the project we overestimated the amount of time we had to complete this project; the main change we would make is to reduce the number of core features. Although most are implemented, we are at the end of the time for development and still have core features that are outstanding, and by reducing the core features it would’ve allowed us to create CampusLink to a higher quality. Looking to the future we would complete the application by integrating the admin frontend and backend and completing the teacher’s requirements. We would add more chatroom options like image and file sharing, and a higher level of security. We would also migrate to REACT, allowing us to remove some duplicate code, reducing the file size of the project making it easier to read. Overall, team management went well, and we were able to equally and fairly share the work based on the team members’ skills, experience and preference.
<h2>References</h2>
Atkinson, H. A. (2024). HTTP_JAVA. GitHub. https://github.com/HarryAtkin/HTTP_Java</br>
ClassDojo, Inc. (2011). ClassDojo. ClassDojo. https://www.classdojo.com/en-gb/</br>
Figma. (2015). Figma: The Collaborative Interface Design Tool. Think bigger. Build faster. https://www.figma.com/</br>
GitHub, Inc. (2025). GitHub Dashboard. GitHub. https://github.com/dashboard</br>
JetBrains. (2025). IntelliJ IDEA The IDE for Professional Development in Java and Kotlin. JetBrains: Essential tools for software developers and teams. https://www.jetbrains.com/idea/ </br>
Lucid Software Inc. (2025). Lucid Chart. Lucidchart | Diagramming Powered By Intelligence. https://www.lucidchart.com/pages. Lucid Chart. https://www.lucidchart.com/pages</br>
Meta. (2013). React [Mobile application software]. (19). Meta. https://react.dev/</br>
Szafranski, M.S. (2024). Student voice: communication or commodity?. LSE Higher Education Blog. https://blogs.lse.ac.uk/highereducation/2024/03/07/student-voice-communication-or-commodity/</br>
The PostgreSQL Global Development Group. (1996-2025). PostgreSQL: The World’s Most Advanced Open Source Relational Database. Postgresql.org. https://www.postgresql.org/</br>
The PostrgreSQL Global Development Group. (2023). Documentation. PostgreSQL JDBC Driver. https://jdbc.postgresql.org/</br>
Unitu. (2024). Home – Unitu. Unitu. https://unitu.io/</br>
UK Government. (2018). Data Protection Act 2018. Legislation.gov.uk. https://www.legislation.gov.uk/ukpga/2018/12/contents</br>
Vmware Tanzu. (2005-2025). Spring Boot. Spring Boot. https://spring.io/projects/spring-boot</br>
Vmware Tanzu. (2005-2025). Spring Data JPA. Spring Boot. https://spring.io/projects/spring-data-jpa</br>
W3C. (2024). Web Content Accessibility Guidelines (WCAG) 2.2. https://www.w3.org/TR/WCAG22/</br>
<h2>Appendix</h2>
<h3>Team meeting – Appendix A</h3>
Below are our meeting minutes for our in-person meetings which took place twice a week.

<table>
<tr>
<th>Time/Date</th>
<th>Location</th>
<th>Attendees</th>
<th>Discussion</th>
<th>Plans</th>
<th>Comments</th>
</tr>
<tr>
<td>Mon 24th @16:30</td>
<td>SJ3/04 – Practical</td>
<td>
<ul>
<li>Mohammad Isa – U2389635</li>
<li>Harry Atkinson – U2364809</li>
<li>Ibrahim Khalifa – U2389634</li>
<li>Amina Haq Nawaz -U2366462</li>
<li>Aadil Hasan -U2360609</li>
<li>Fizan Hussain – U2354451</li>
</ul>
</td>
<td>
<ul>
<li>Creating the scrum plan.</li>
<li>Changes to the database so it adheres to the needed program functionality see appendix B.</li>
</ul>
</td>
<td><ul>
<li>Create the finalized development plan</li>
<li>Create the frontend for the login page. By 3rd of March</li>
<li>Create the backend in spring boot and create the necessary database tables. By the 3rd of March</li>
</ul></td>
<td></td>
</tr>
<tr>
<td>Thur 27th @12:30</td>
<td>SJ3/04 – Practical</td>
<td><ul>
<li>Mohammad Isa – U2389635</li>
<li>Ibrahim Khalifa – U2389634</li>
<li>Amina Haq Nawaz -U2366462</li>
<li>Aadil Hasan -U2360609</li>
<li>Fizan Hussain – U2354451</li>
</ul>
</td>
<td><ul>
<li>Discussed the need to finalize the UI design for the login page.</li>
<li>Discussed what is needed to get the database up and running.</li>
<li>Discussed the design of a logo.</li>
<li>Discussed the implementation of accessibility features.</li>
</ul>
</td>
<td><ul>
<li>Finish the UI design.</li>
</ul>
</td>
<td><ul>
<li>Harry informed the group that he is unable to attend this meeting.</li>
<li>Finishing off the UI design for login/register page.</li>
<li>Create SQL script for creating the database.</li>
<li>Generating mock data for the database</li>
<li>Talked about logo design</li>
<li>Discussed how we would implement accessibility features such as language change</li>
</ul>
</td>
</tr>
</table>



