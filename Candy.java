class Candy
{
 private String name;

public Candy()
{
  name = "";
}

Candy(String aName)
{
  name = aName;
}

void setName(String newName)
{
  name = newName;
}

String getName()
{
  return name;
}

void print()
{
  System.out.println(name);
}


}
