package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_models extends Chassis
{
	static int	MODEL_C1500			= 8;
	static int	MODEL_T1800			= 9;
	static int	MODEL_T1800S		= 10;
	static int	MODEL_TX2200GT		= 11;

	public Coyot_models( int id )
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