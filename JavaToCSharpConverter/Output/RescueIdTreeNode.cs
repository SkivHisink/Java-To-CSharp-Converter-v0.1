using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueIdTreeNode : RjniBaseClass
{


  protected RescueIdTreeNode(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueIdTreeNode(nativeNdx);
  }

}

}