# hibernate-statistics-WFLY-10298
hibernate-statistics-WFLY-10298

To enable the statistics you have to add following code to standalone.xml right after the extensions element.    
<system-properties>
        <property name="hibernate.generate_statistics" value="true"/>
</system-properties>

To run this app, you have to execute the code from src/main/resources/META-INF/datasource.cli in your cli to create needed datasource.
