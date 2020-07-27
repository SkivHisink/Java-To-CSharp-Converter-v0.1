package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueIdTreeNode.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueIdTreeNode extends RjniBaseClass
{


  protected RescueIdTreeNode(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueIdTreeNode(nativeNdx);
  }

  private native void Delete_RescueIdTreeNode(long ndx);
}
