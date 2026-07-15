# Difference between JPA, Hibernate, and Spring Data JPA

**JPA (Java Persistence API)**
A specification (a set of interfaces/rules), not an implementation. It defines how Java objects
should be mapped to database tables (ORM) but doesn't provide the actual code that does it.

**Hibernate**
A concrete implementation of the JPA specification. It's the actual engine that does the
object-relational mapping, generates SQL, manages the persistence context, etc. You can use
Hibernate directly, or through JPA's standard interfaces.

**Spring Data JPA**
A layer built on top of JPA (and by extension, Hibernate) that removes boilerplate. Instead of
writing DAO/repository implementation code yourself, you just declare an interface
(e.g., `StudentRepository extends JpaRepository<Student, Long>`) and Spring generates the
implementation at runtime.

**In short**:
JPA = the rulebook → Hibernate = the engine that follows the rulebook → Spring Data JPA =
a productivity layer that writes the repository code for you, using Hibernate under the hood.