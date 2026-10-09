package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Duhen_models extends Chassis
{
	static int	MODEL_SUNSTRIP_1_5_DVC			= 1;
	static int	MODEL_SUNSTRIP_1_8_DVC			= 2;
	static int	MODEL_SUNSTRIP_2_2_DVC			= 3;
	static int	MODEL_RACING_SUNSTRIP_2_0_CDVC	= 4;

	public Duhen_models( int id )
	{
		super( id );
		carCategory = PACKAGE;

		make = MAKE_DUHEN;
	}

	public void updatevariables()
	{
		super.updatevariables();
	}
}
