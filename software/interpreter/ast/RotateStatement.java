package ast;

import visitor.ASTVisitor;
import visitor.StatementVisitor;

public class RotateStatement
   extends Statement
{
   private Servo _servo;
   private Expression _angle;

   public RotateStatement(Servo servo, Expression angle)
   {
      _servo = servo;
      _angle = angle;
   }

   public Servo getServo()
   {
      return _servo;
   }

   public Expression getAngle()
   {
      return _angle;
   }

   public <T> T visit(StatementVisitor<T> guest)
   {
      return guest.visit(this);
   }

   public <T> T visit(ASTVisitor<T> guest)
   {
      return guest.visit(this);
   }
}
