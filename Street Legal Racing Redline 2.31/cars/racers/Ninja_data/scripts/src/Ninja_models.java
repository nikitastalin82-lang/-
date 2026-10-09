package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_models extends Chassis
{
	static int	MODEL_TURBOHATCH	= 12;
	static int	MODEL_POWERLINE_S	= 13;
	static int	MODEL_POWERLINE_XT	= 14;
	static int	MODEL_TOURER		= 15;

	public Ninja_models( int id )
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