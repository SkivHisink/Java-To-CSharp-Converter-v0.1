package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueStreamReporter.java

    Rod Hanks   Aug 25 2005

******************************************************************/
public class RescueStreamReporter extends RescueReporter
{


  protected RescueStreamReporter(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueStreamReporter()
  {
    nativeNdx = Create_RescueStreamReporter1();
  }

  private native long Create_RescueStreamReporter1();
}
