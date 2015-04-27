package unifiedshoppingexperience;

/**
 * Keeps information about a product, and overrides the hashCode and equals
 * method to fit properly with its purpose.
 *
 * @author Gruppe12
 */
public class Product
{
    private String model;
    private double price;
    //Temporarily attribute for prototype
    private String type;
    private String name;

    /**
     * Creates a product with a model name and price.
     *
     * @param model The model name of the product.
     * @param price The price of the product.
     */
    public Product(String model, double price, String type, String name)
    {
        this.model = model;
        this.price = price;
        this.type = type;
        this.name = name;
    }

    /**
     * Implements the hasCode method so it's based on the model, since model is
     * a primary key this works properly.
     *
     * @return Returns the hash code of the model name.
     */
    @Override
    public int hashCode()
    {
        return model.hashCode();
    }

    /**
     * Implements the equals method so its based on the attributes of the class.
     *
     * @param other The referenced object with which to compare.
     * @return Returns true if the object has the same attribute values.
     */
    @Override
    public boolean equals(Object other)
    {
        if (other == this)
        {
            return true;
        }

        if (!(other instanceof Product))
        {
            return false;
        }

        Product p = (Product) other;

        return p.model.equals(this.model) && p.price == this.price;
    }

    /**
     * Overrides the toString methods to provide relevant information about the
     * product.
     *
     * @return Returns information about the product as string.
     */
    @Override
    public String toString()
    {
        return "Navn: " + name + "\nModel: " + model + ". \nPris: " + price + ". \nType: " + type;
    }

    /**
     *
     *
     * @return Returns the type of the product as string.
     */
    public String getType()
    {
        return type;
    }

    /**
     *
     * @return Returns the name of the product as string.
     */
    public String getName()
    {
        return name;
    }
}
