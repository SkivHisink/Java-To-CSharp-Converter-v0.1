using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueReporter : org.Rescue.rjni.RjniBaseClass
{


  protected RescueReporter(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  protected RescueReporter()
  {
  }

  public void dispose()
  {
    Delete_RescueReporter(nativeNdx);
  }

  public string ClassName()
  {
    string myReturn = ClassName1(nativeNdx);
    return myReturn;
  }

}

}