All creational patterns:
* Creational (Static) Method
    What: static wrapper method for constructor;
    Why:
        1) Isolate constructor argument changes
        2) Add logic like cashing
        3) Better name to express intention then constructor
        4) non-static can be used to implement immutability

* Simple Factory
    What: class with static method that creates certain objects based on input args