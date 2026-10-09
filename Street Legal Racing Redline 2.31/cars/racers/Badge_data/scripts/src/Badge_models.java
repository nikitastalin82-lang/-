package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;

public class Badge_models extends Chassis
{
	static int	MODEL_BADGE_67	= 3;
	static int	MODEL_BADGE_GTO	= 4;

	public Badge_models( int id )
	{
		super( id );
		carCategory = PACKAGE;

		make = MAKE_HAULER_S_HEAVEN;
	}

	public void updatevariables()
	{
		super.updatevariables();
	}
}