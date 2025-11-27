## This is a sample project that produces a Shadow JAR.

#### Expected result:

Two JARs are produced:

* Regular JAR: `original-Maven-ShadowJAR-Sample-1.0-SNAPSHOT.jar`
* Shadow JAR: `Maven-ShadowJAR-Sample-1.0-SNAPSHOT.jar`

Compared to the Regular JAR, Shadow JAR contains all the dependencies,
which makes it a lot larger.
