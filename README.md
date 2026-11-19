# eCommerceApp: Refactoring Project

Semester refactoring project for Software Engineering Course, supervised by Prof. Fahd Kalloubi

## Credits
Forked from [Kousay-Jebir/eCommerceApp](https://github.com/Kousay-Jebir/eCommerceApp)
All original code is by Kousay Jebir; see `originale/README.md`

## Goal
Improve the design and quality of the console e-commerce app by applying
software engineering best practices, such as the SOLID principles, design
patterns and clean code, while preserving its behavior.

## Structure
- `originale/`: the original code, never modified
- `refactored/`: the refactored version (Maven project; code in `src/main/java`, tests in `src/test/java`)
- `docs/`: metrics, UML diagrams, refactoring log, report

## How to run
**Requirements:**
- JDK 21 for both versions (the original is compiled with `--enable-preview`, so use this exact version)
- Maven 3.9+ for the refactored version

Check yours first:
```bash
java --version
javac --version
mvn -v
```
Java and javac should report `21`, and Maven should report 3.9 or newer

**Refactored version**
```bash
cd refactored
mvn compile
java -cp target/classes App
```

**Run tests**
```bash
cd refactored
mvn test
```

**Original version**
```bash
cd originale
javac --enable-preview --release 21 -d bin -sourcepath src src/App.java
java --enable-preview -cp bin App
```

## Approach
1. Characterization tests on the original behavior
2. Baseline metrics and a list of code smells
3. One commit per refactoring, named after the technique and principle
4. Re-measure and compare

## Refactoring log
See `docs/refactoring-log.md`