package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;

public class Sunset_models extends Chassis
{
	static int	MODEL_E96S		= 6;
	static int	MODEL_E98T		= 7;
	static int	MODEL_E001SL	= 8;

	public Sunset_models( int id )
	{
		super( id );
		carCategory = PACKAGE;

		make = MAKE_SHIMUTSHIBU;
	}

	public void updatevariables()
	{
		super.updatevariables();
	}
}