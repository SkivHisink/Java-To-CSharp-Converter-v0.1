package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueGeometryPropertyList.java

	  Returns a table-and-column style listing of properties in a
	  RescueGeometry (and possibly it's LGR's) that places properties
	  within context of groupings and times.

	  This class is ephemeral.  It is accurate at the moment it is 
	  created but any editing events after that point are not reflected
	  in it's values.  It is not persistent.

	  The order is either : by group, by time step, by geometry, by property
				   or     : by time step, by group, by geometry, by property

	  Properties that are in more than one group and/or timestep may appear
	  more than once.

	  Properties that are not in a timestep will not appear.

    Rod Hanks   October 2006

******************************************************************/
public class RescueGeometryPropertyList extends RjniBaseClass
{
	protected RescueGeometryPropertyList(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueGeometryPropertyList(RescueGeometry geometry, 
																		boolean byTimeStep,               // TRUE if order of rows is by time step, by group, by geometry.
                                                                      // FALSE for by group, by time step by geometry.  Of course,
                                                                      // if you limit to a single group or time step this
                                                                      // is immaterial.
																	  boolean includeLGRs,              // TRUE if properties of LGRs are included.
																	  RescuePropertyGroup nullOrGroup,  // Non-null, limit to particular RescuePropertyGroup.
																	  java.lang.String nullOrTimeStepName)
  {
    nativeNdx = Create_RescueGeometryPropertyList0((geometry == null) ? 0 : geometry.nativeNdx,
                                                   byTimeStep, includeLGRs, 
																									 (nullOrGroup == null) ? 0 : nullOrGroup.nativeNdx,
                                                    nullOrTimeStepName);
  }

	
  public void dispose()
  {
    Delete_RescueGeometryPropertyList(nativeNdx);
  }


  public int Count()
  {
    int myReturn = Count1(nativeNdx);
    return myReturn;
  }

  public RescueProperty NthRowProperty(long zeroBasedOrdinal)
  {
    long returnNdx = NthRowProperty2(nativeNdx
                             ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueProperty myReturn = new RescueProperty(returnNdx);
      return myReturn;
    }
  }

  public RescueGeometry NthRowGeometry(long zeroBasedOrdinal)
  {
    long returnNdx = NthRowGeometry3(nativeNdx
                             ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeometry myReturn = new RescueGeometry(returnNdx);
      return myReturn;
    }
  }

  public RescueTimeStepGroup NthRowTimeStepGroup(long zeroBasedOrdinal)
  {
    long returnNdx = NthRowTimeStepGroup4(nativeNdx
                             ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTimeStepGroup myReturn = new RescueTimeStepGroup(returnNdx);
      return myReturn;
    }
  }

  public RescuePropertyGroup NthRowPropertyGroup(long zeroBasedOrdinal)
  {
    long returnNdx = NthRowPropertyGroup5(nativeNdx
                             ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePropertyGroup myReturn = new RescuePropertyGroup(returnNdx);
      return myReturn;
    }
  }

  private native long Create_RescueGeometryPropertyList0(long geometryNdx,
																												 boolean byTimeStep,
																												 boolean includeLGRs,
																												 long groupNdx,
																												 java.lang.String nullOrTimeStepName);
  private native void Delete_RescueGeometryPropertyList(long ndx);
  private native int Count1(long refNdx);
  private native long NthRowProperty2(long refNdx
                               ,long zeroBasedOrdinal);
  private native long NthRowGeometry3(long refNdx
                               ,long zeroBasedOrdinal);
  private native long NthRowTimeStepGroup4(long refNdx
                               ,long zeroBasedOrdinal);
  private native long NthRowPropertyGroup5(long refNdx
                               ,long zeroBasedOrdinal);
}