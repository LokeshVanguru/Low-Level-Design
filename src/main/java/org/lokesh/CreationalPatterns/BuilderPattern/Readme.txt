# 🚀 Builder Design Pattern in Java

## 1. What is Builder Pattern?

➜ Builder Pattern is a **Creational Design Pattern**.

➜ It creates objects step by step instead of passing many values through a constructor.

➜ It makes object creation simple, readable and flexible.

## 2. Why Do We Need It?

➜ When a class contains many fields, passing all values through a constructor becomes difficult.

**Without Builder Pattern:**
- Difficult to remember parameter order.
- Constructor becomes lengthy.
- Difficult to handle optional values.
- Less readable code.

**With Builder Pattern:**
- Set values using meaningful method names.
- Set only the required values.
- Improve readability and maintainability.

## 3. Main Components

1. **Employee (Product):** Actual object we want to create.
2. **EmployeeBuilder (Builder):** Stores values and creates the Employee object.
3. **Client:** Uses the Builder to create an Employee.

## 4. How Does It Work?

**Object creation flow:**

```text
Employee.builder()
       ↓
Creates EmployeeBuilder object
       ↓
Set values using builder methods
       ↓
build() method executes
       ↓
new Employee(this)
       ↓
Employee constructor receives Builder object
       ↓
Copies values from Builder to Employee
       ↓
Final Employee object is created
```

## 5. Important Concepts

➜ **builder()** – Static method that creates and returns a Builder object.

➜ **return this** – Returns the current Builder object to support method chaining.

➜ **build()** – Creates and returns the final Employee object.

➜ **this** – Refers to the current Builder object when passed to the Employee constructor.

## 6. Where Do We Use It in Spring Boot?

➜ **DTO creation** – Creating request and response DTO objects.

➜ **API response creation** – Building standard API responses.

➜ **HTTP client configuration** – Example: `RestClient.builder()`.

➜ **Lombok** – `@Builder` automatically generates Builder methods.

## 7. Advantages

- Readable and clean object creation.
- Avoids lengthy constructors.
- Supports optional fields.
- Easy to maintain.
- Can create immutable objects.

## 8. Disadvantages

- Requires additional Builder code.
- Creates an additional Builder object.
- Not necessary for simple objects with very few fields.

## 9. Interview Questions

**Q1. What type of design pattern is Builder?**

➜ Creational Design Pattern.

**Q2. Why do we use Builder Pattern?**

➜ To create complex objects step by step and avoid lengthy constructors.

**Q3. Why do we return `this`?**

➜ To achieve method chaining.

**Q4. What is the purpose of `build()`?**

➜ To create and return the final object.

**Q5. What is `Employee.builder()`?**

➜ A static factory method that returns a new EmployeeBuilder object.

**Q6. Can Builder Pattern create immutable objects?**

➜ Yes, by using final fields and avoiding setters in the Product class.

---

## ⭐ Remember

**Builder Pattern = Create an object step by step.**

```text
builder()
   ↓
Set Values
   ↓
build()
   ↓
Final Object
```

**One-line interview answer:**

Builder Pattern is a Creational Design Pattern that helps us create complex objects step by step, improves code readability and avoids constructors with too many parameters.