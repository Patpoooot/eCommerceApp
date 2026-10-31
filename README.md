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
- `refactored/`: the refactored version
- `docs/`: metrics, UML diagrams, refactoring log, report

## How to run
**Requirements:** JDK 21 (the code uses `--enable-preview`, so use this exact version)
Check yours first:
```bash
java --version
javac --version
```
Both should report `21`

**Refactored version**
```bash
cd refactored
javac --enable-preview --release 21 -d bin -sourcepath src src/App.java
java --enable-preview -cp bin App
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