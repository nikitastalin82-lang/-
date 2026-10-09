package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Hauler_s_models extends Chassis
{
	static int	MODEL_SUPERDUTY_500			= 1;
	static int	MODEL_SUPERDUTY_EXTRA_750	= 2;

	public Hauler_s_models( int id )
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
