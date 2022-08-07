/**
* interface Lockable
*/
public interface Lockable {

/**
* setKey() method
*/
void setKey(int key);

/**
* lock() method
*/
void lock(int key);

/**
* unlock() method
*/
void unlock(int key);

/**
* isLocked() method
*/
boolean isLocked();
}

/**
* class Wizard
* implements Lockable
*/
public class Wizard implements Lockable {

/**
* instance variable
* private String name
*/
private String name;
/**
* instance variable
* private String health
*/
private int health;
/**
* instance variable
* private int key
*/
private int key;

/**
* instance variable
* private boolean locked
*/
private boolean locked;

/**
* getter method for name
*/
public String getName() {
return name;
}

/**
* setter method for name
*
* @param name
*/
public void setName(String name) {
this.name = name;
}

/**
* getter method for health
*/
public int getHealth() {
return health;
}

/**
* setter method for health
*
* @param health
*/
public void setHealth(int health) {
this.health = health;
}

/**
* setter method for key
*
* @param key
*/
public void setKey(int key) {
if (this.key == 0 && key > 0)
this.key = key;
}

/**
* method checks whether the Wizard is locked
*
* @return boolean
*/
public boolean isLocked() {
return locked;
}

/**
* constructor for Wizard
* initialises key as 0
* initialises locked as false
*/
public Wizard() {
this.key = 0;
this.locked = false;
}

/**
* constructor for Wizard
* initialises key as 0
* initialises locked as false
* sets the name
*
* @param name
*/
public Wizard(String name) {
this();
this.name = name;
}

/**
* method takeDamage()
* method takes damage
* if wizard is not locked
*
* @param power
*/
public void takeDamage(int power) {
if (!isLocked())
this.health = this.health - power;
}

/**
* method lock()
* this method locks if the key matches
*/
public void lock(int key) {
if (this.key == key)
this.locked = true;
}

/**
* method unlock()
* this method unlocks if the key matches
*/
public void unlock(int key) {
if (this.key == key)
this.locked = false;
}

}