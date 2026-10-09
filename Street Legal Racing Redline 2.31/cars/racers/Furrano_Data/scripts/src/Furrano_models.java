package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_models extends Chassis
{
	static int	MODEL_GT54	= 5;
	static int	MODEL_GTS	= 6;

	public Furrano_models( int id )
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
