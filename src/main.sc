require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Hello
        q!: *hello
        q!: * (привет/здравствуй* ~добрый (~утро/~день/~вечер/~ночь)) * 
        random:
            a: Здравствуйте! Чем могу помочь?
            a: Привет! Я могу тебе сообщить погоду и курс валют

    state: Weather
        intent!: /weather
        q!: *погода
        q!: *скажи погоду
        random:
            a: В Санкт-Петербурге облачно, +14
            a: В Санкт-Петербурге солнечно, +21
            a: В Санкт-Петербурге сильный дождь, +9

    state: NoMatch
        event!: noMatch
        random:
            a: Я вас не понял. Повторите свой вопрос
            a: Я вас не понял. Повторите, пожалуйста

    state: Currency
        event!: /currency 
        random:
            a: Курс доллара: 90,30 руб.
            a: Курс евро: 110,50 руб.
            a: Курс фунта стерлингов: 130,70 руб.