using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueStreamReporter : RescueReporter
{


  protected RescueStreamReporter(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueStreamReporter()
  {
    nativeNdx = Create_RescueStreamReporter1();
  }

}

}