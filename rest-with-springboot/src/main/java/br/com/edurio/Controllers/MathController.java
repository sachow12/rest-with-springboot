package br.com.edurio.Controllers;

import br.com.edurio.Calculadora.ConverterAndCheck;
import br.com.edurio.Calculadora.MathOperations;
import br.com.edurio.exceptions.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;
//controller do padrao MVC
@RestController
public class MathController {
    private final AtomicLong counter = new AtomicLong();
    private ConverterAndCheck converterAndCheck = new ConverterAndCheck();
    private MathOperations mathOperations = new MathOperations();

    //mapeamento
    @RequestMapping(value ="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        if (!converterAndCheck.isNumeric(numberOne) || !converterAndCheck.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please enter a valid number!");
        }
        return mathOperations.sum(converterAndCheck.convertToDouble(numberOne) , converterAndCheck.convertToDouble(numberTwo));


    }

    //mapeamento
    @RequestMapping(value ="/sub/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double sub(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        if (!converterAndCheck.isNumeric(numberOne) || !converterAndCheck.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please enter a valid number!");
        }
        return mathOperations.sub(converterAndCheck.convertToDouble(numberOne) , converterAndCheck.convertToDouble(numberTwo));


    }
    @RequestMapping(value ="/mult/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double mult(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        if (!converterAndCheck.isNumeric(numberOne) || !converterAndCheck.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please enter a valid number!");
        }
        return mathOperations.mult(converterAndCheck.convertToDouble(numberOne), converterAndCheck.convertToDouble(numberTwo));


    }
    @RequestMapping(value ="/div/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double div(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        if (!converterAndCheck.isNumeric(numberOne) || !converterAndCheck.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please enter a valid number!");
        }
        return mathOperations.div(converterAndCheck.convertToDouble(numberOne) , converterAndCheck.convertToDouble(numberTwo));


    }
    @RequestMapping(value ="/avg/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double avg(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        if (!converterAndCheck.isNumeric(numberOne) || !converterAndCheck.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please enter a valid number!");
        }
        return mathOperations.avg(converterAndCheck.convertToDouble(numberOne), converterAndCheck.convertToDouble(numberTwo));


    }
    @RequestMapping(value ="/sqrt/{number}", method=RequestMethod.GET)
    public Double sqrt(
            @PathVariable(value = "number") String number

    ) throws Exception {
        if (!converterAndCheck.isNumeric(number)) {
            throw new UnsupportedMathOperationException("Please enter a valid number!");
        }
        return mathOperations.sqrt(converterAndCheck.convertToDouble(number));


    }
}
