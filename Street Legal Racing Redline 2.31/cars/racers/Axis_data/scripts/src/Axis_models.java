package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;

public class Axis_models extends Chassis
{
	static int	MODEL_200S		= 5;
	static int	MODEL_200XT		= 6;
	static int	MODEL_ZX360		= 7;

	public Axis_models( int id )
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