package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_models extends Chassis
{
	static int	MODEL_TORNADO			= 3;
	static int	MODEL_LUX_4000			= 4;
	static int	MODEL_EXTREME_EDITION	= 5;

	public Naxas_models( int id )
	{
		super( id );
		carCategory = PACKAGE;

		make = MAKE_PRIME;
	}

	public void updatevariables()
	{
		super.updatevariables();
	}
}