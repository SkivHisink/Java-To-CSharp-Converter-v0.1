package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueTimeStepManager.java

    Rod Hanks   Oct 9, 2006

******************************************************************/
public class RescueTimeStepManager extends RjniBaseClass
{

  protected RescueTimeStepManager(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueTimeStepManager(nativeNdx);
  }

  public long Count64()
  {
    long myReturn = Count5(nativeNdx);
    return myReturn;
  }

  public int Count()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(Count64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public java.lang.String[] UniqueTimestepNames()
  {
    return UniqueTimestepNames6(nativeNdx);
  }

  public java.lang.String[] UniquePropertyNames()
  {
    return UniquePropertyNames6a(nativeNdx);
  }

  public long UniquePropertyNameCount64()
  {
    long myReturn = UniquePropertyNameCount5a(nativeNdx);
	return myReturn;
  }

  public int UniquePropertyNameCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(UniquePropertyNameCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public RescueTimeStepGroup[] TimeSteps()
  {
    long[] bagNdxes = TimeSteps7(nativeNdx);
	int howMany = bagNdxes.length;
	RescueTimeStepGroup[] groups = new RescueTimeStepGroup[howMany];
	int loop;
	for (loop = 0; loop < howMany; loop++)
	{
	  groups[loop] = new RescueTimeStepGroup(bagNdxes[loop]);
	}
    return groups;
  }

  public RescueTimeStepGroup GroupForTime(java.lang.String timeToFind)
  {
    long bagNdx = GroupForTime8(nativeNdx, timeToFind);
	if (bagNdx == 0)
	{
	  return null;
	}
	else
	{
	  return new RescueTimeStepGroup(bagNdx);
	}
  }

  public RescueTimeStepGroup MakeTimeStepGroup(int year, int month, int day)
  {
    long groupNdx = MakeTimeStepGroup10a(nativeNdx, year, month, day);
	if (groupNdx == 0)
	{
	  return null;
	}
	else
	{
	  return new RescueTimeStepGroup(groupNdx);
	}
  }

  public RescueTimeStepGroup MakeTimeStepGroup(int year, int month, int day,
                                                                          int hour, int minute, int second)
  {
    long groupNdx = MakeTimeStepGroup10b(nativeNdx, year, month, day, hour, minute, second);
	if (groupNdx == 0)
	{
	  return null;
	}
	else
	{
	  return new RescueTimeStepGroup(groupNdx);
	}
  }

  public RescueTimeStepGroup MakeTimeStepGroup(java.lang.String name)
  {
    long groupNdx = MakeTimeStepGroup10c(nativeNdx, name);
	if (groupNdx == 0)
	{
	  return null;
	}
	else
	{
	  return new RescueTimeStepGroup(groupNdx);
	}
  }

  private native void Delete_RescueTimeStepManager(long nativeNdx);
  private native long Count5(long nativeNdx);
  private native long UniquePropertyNameCount5a(long nativeNdx);
  private native java.lang.String[] UniqueTimestepNames6(long nativeNdx);
  private native java.lang.String[] UniquePropertyNames6a(long nativeNdx);
  private native long[] TimeSteps7(long nativeNdx);
  private native long GroupForTime8(long nativeNdx, java.lang.String timeToFind);
  private native long MakeTimeStepGroup10a(long nativeNdx, int year, int month, int day);
  private native long MakeTimeStepGroup10b(long nativeNdx, int year, int month, int day,
                                                                          int hour, int minute, int second);
  private native long MakeTimeStepGroup10c(long nativeNdx, java.lang.String name);
}